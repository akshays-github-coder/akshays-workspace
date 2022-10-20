package com.cwa.spring.framework.annotations;

import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Schedules;

public class SpringSchedulingAnnotations {
	
	@EnableAsync
	@EnableScheduling
	@Async
	@Scheduled
	@Schedules
	
}
