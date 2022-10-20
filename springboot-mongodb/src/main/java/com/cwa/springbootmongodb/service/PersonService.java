package com.cwa.springbootmongodb.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cwa.springbootmongodb.collection.Person;

public interface PersonService {

	String save(Person person);
	
	List<Person> getPersonStartWith(String name);

	void delete(String id);

	List<Person> getByPersonAge(Integer minAge, Integer maxAge);

	Page<Person> search(String name, Integer minAge, Integer maxAge, String city, Pageable pageable);

}
