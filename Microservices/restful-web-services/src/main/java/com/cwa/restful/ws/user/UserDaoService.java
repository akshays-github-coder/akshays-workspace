package com.cwa.restful.ws.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	public static int usersCount=5;

	//creating an instance of ArrayList  
	private static List<User> users = new ArrayList<User>();

	//static block
	static {
		users.add(new User(1, "Akshay", new Date()));
		users.add(new User(2, "Ram", new Date()));
		users.add(new User(3, "Sham", new Date()));
		users.add(new User(4, "Ganesh", new Date()));
		users.add(new User(5, "Dinesh", new Date()));
	}

	//method that retrieve all users from the list 
	public List<User> findAll(){
		return users;
	}

	//method that add the user in the list
	public User saveUser(User user) {
		
		/*
		 * if(user.getId() == null) { //increments the user id user.setId(usersCount++);
		 * }
		 */
		 
		users.add(user);
		return user;
	}

	public User findOne(int id) {
		for(User user: users) {
			if(user.getId()==id) 
				return user;
		}
		return null;
	}
	
	//method that delete a user resource
	public User deleteById(int id) {
		Iterator<User> iterator = users.iterator();
		while(iterator.hasNext()) {
			User user = iterator.next();
			if(user.getId()==id) {
				iterator.remove();
				return user; //returns the deleted resource back  
			}
		}
		return null;
	}
}

