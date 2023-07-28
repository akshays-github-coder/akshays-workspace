package com.cwa.springbootmongodb.controller;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cwa.springbootmongodb.collection.Person;
import com.cwa.springbootmongodb.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;

	@PostMapping
	public String save(@RequestBody Person person) {
		return personService.save(person);
	}

	@GetMapping 
	public List<Person> getPersonStartWith(@RequestParam(value = "name") String name){
		return personService.getPersonStartWith(name); 
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable String id) {
		personService.delete(id);
	} 
	
	@GetMapping(value = "/age")
	public List<Person> getByPersonAge(@RequestParam Integer minAge, @RequestParam Integer maxAge) {
		return personService.getByPersonAge(minAge, maxAge);
	}
	
	public Page<Person> searchPerson(@RequestParam(required = false) String name, @RequestParam(required = false) Integer minAge,
			@RequestParam(required = false) Integer maxAge, @RequestParam(required = false) String city, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer size){
		
		Pageable pageable = PageRequest.of(page, size);
		return personService.search(name, minAge, maxAge, city, pageable);
	}
	
	@GetMapping(value = "/oldestPerson")
	public List<Document> getOldestPerson(){
		return personService.getOldestPersonByCity();
	}
	
	@GetMapping(value = "/getPopulationByCity")
	public List<Document> getPopulationByCity(){
		return personService.getPopulationByCity();
	}
	
}
