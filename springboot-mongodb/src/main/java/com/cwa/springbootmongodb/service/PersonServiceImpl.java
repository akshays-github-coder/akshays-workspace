package com.cwa.springbootmongodb.service;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;
import org.springframework.data.mongodb.core.aggregation.SortOperation;
import org.springframework.data.mongodb.core.aggregation.UnwindOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.support.PageableExecutionUtils;
import org.springframework.stereotype.Service;

import com.cwa.springbootmongodb.collection.Person;
import com.cwa.springbootmongodb.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public String save(Person person) {
		return personRepository.save(person).getFirstName();
	}

	@Override
	public List<Person> getPersonStartWith(String name) {
		return personRepository.findByFirstNameStartsWith(name);
	}

	@Override
	public void delete(String id) {
		personRepository.deleteById(id);
	}

	@Override
	public List<Person> getByPersonAge(Integer minAge, Integer maxAge) {
		// TODO Auto-generated method stub
		return personRepository.findPersonByAgeBetween(minAge, maxAge);
	}

	@Override
	public Page<Person> search(String name, Integer minAge, Integer maxAge, String city, Pageable pageable) {
		
		Query query = new Query().with(pageable);
		List<Criteria> criterias = new ArrayList<Criteria>();
		
		if(name != null && !name.isEmpty()) {
			criterias.add(Criteria.where("firstName").regex(name, "i"));
		}
		
		if(minAge != null && maxAge != null) {
			criterias.add(Criteria.where("age").gte(minAge).lte(maxAge));
		}
		
		if(city != null && !city.isEmpty()) {
			criterias.add(Criteria.where("addresses.city").is(city));
		}
		
		if(!criterias.isEmpty()) {
			query.addCriteria(new Criteria().andOperator(criterias.toArray(new Criteria[0]))); // Converting criteria list to array and adding it into query
		}
		
		Page<Person> people = org.springframework.data.support.PageableExecutionUtils.getPage(mongoTemplate.find(query, Person.class), pageable, () -> mongoTemplate.count(query.skip(0).limit(0), Person.class));
		
		return people;
	}

	@Override
	public List<Document> getOldestPersonByCity() {
		
		UnwindOperation unwindOperation = Aggregation.unwind("addresses");
		SortOperation sortOperation = Aggregation.sort(Sort.Direction.DESC, "age");
		GroupOperation groupOperation = Aggregation.group("addresses.city").first(Aggregation.ROOT).as("oldestPerson");
		
		Aggregation aggregation = Aggregation.newAggregation(unwindOperation, sortOperation, groupOperation);
		
		List<Document> person = mongoTemplate.aggregate(aggregation, Person.class, Document.class).getMappedResults();
		return person;
	}

	@Override
	public List<Document> getPopulationByCity() {
		
		UnwindOperation unwindOperation = Aggregation.unwind("addresses");
		GroupOperation groupOperation = Aggregation.group("addresses.city").count().as("popCount");
		SortOperation sortOperation = Aggregation.sort(Sort.Direction.DESC, "popCount");
		ProjectionOperation projectionOperation = Aggregation.project().andExpression("_id").as("city").andExpression("popCount").as("count").andExclude("_id");
		
		Aggregation aggregation = Aggregation.newAggregation(unwindOperation, groupOperation, sortOperation, projectionOperation);
		
		List<Document> documents = mongoTemplate.aggregate(aggregation, Person.class, Document.class).getMappedResults();
		return documents;
	}
}
