package com.cwa.restful.ws.user;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import org.springframework.hateoas.*;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService userDaoService;
	
	@GetMapping(path="/users")
	public List<User> retrieveAllUsers(){
		return userDaoService.findAll();
	}
	
	@GetMapping(path="/users/{id}")
	public User retrieveUser(@PathVariable int id) throws UserNotFoundException {
		User user = userDaoService.findOne(id);
		
		//runtime exception
		if(user==null) {
			throw new UserNotFoundException("id: " +id);
//			Resource<User> resource = new Resource<User>(User) 
		}
		return user;
	}
	
	//method that posts a new user detail and returns the status of the user resource  
	@PostMapping(path="/users")
	public ResponseEntity<Object> createUser(@Valid @RequestBody User user) {
		User savedUser = userDaoService.saveUser(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(location).build();
		//On the right-hand side of the postman window, we can see the Status: 201 Created. It means resource has been properly created.
	}	
	
	//method that delete a user resource  
	//if the user deleted successfully it returns status 200 OK otherwise 404 Not Found  
	@DeleteMapping(path="/users/{id}")
	public void deleteUser(@PathVariable int id) throws UserNotFoundException {
		User user = userDaoService.deleteById(id);
		if(user==null) {
			//runtime exception  
			throw new UserNotFoundException("id: " +id);
		}
	}
}
