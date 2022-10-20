package com.cwa.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	@Autowired
	KafkaTemplate<String, Book> kafkaTemplate1;

	private static final String TOPIC = "NewTopic";
	
	@GetMapping("/publish/{message}")
	public String publishMesssage(@PathVariable("message") final String message) {
		kafkaTemplate.send(TOPIC, message);
		return "Published Successfully";
	}
	
	@PostMapping("/publish")
	public String publishJsonMesssage(@RequestBody Book book) {
		kafkaTemplate1.send(TOPIC, book);
		return "JSON Published Successfully";
	}
}
