package com.cwa.restful.ws.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

@RestController
public class FilteringController {

	//returning a single bean as response  
	//values to send name and salary       
	@RequestMapping("/filtering/dynamic")
	public MappingJacksonValue retrieveSomeBeanByDynamicFiltering() {
		
		SomeBean someBean = new SomeBean("Amit", "9664592014", "200000");
		
		//invoking static method filterOutAllExcept()
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name","salary");
		
		//creating filter using FilterProvider class
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		
		//constructor of MappingJacksonValue class  that has bean as constructor argument  
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(someBean);

		//configuring filters  
		mappingJacksonValue.setFilters(filterProvider);
		return mappingJacksonValue;		
	}

	//returning a single bean as response  
	//values to send name and salary       
	@RequestMapping("/filtering-list/dynamic")
	public MappingJacksonValue retrieveSomeBeanByDynamicFiltering1() {
		
		List<SomeBean> list=Arrays.asList(new SomeBean("Saurabh", "8888888888","20000"), new SomeBean("Devesh", "1111111111","34000"));
		
		//invoking static method filterOutAllExcept()
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name","phone");
		
		//creating filter using FilterProvider class
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);
		
		//constructor of MappingJacksonValue class  that has bean as constructor argument  
		MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(list);

		//configuring filters  
		mappingJacksonValue.setFilters(filterProvider);
		return mappingJacksonValue;		
	}
	
	//returning a single bean as response 
	@RequestMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("Akshay", "1000000", "40000");
	}
	
	//returning a list of SomeBeans as response  
	@RequestMapping("/filtering-list")  
	public List<SomeBean> retrieveListOfSomeBeans()  
	{  
	return Arrays.asList(new SomeBean("Saurabh", "8888888888","20000"), new SomeBean("Devesh", "1111111111","34000"));  
	}  
}
