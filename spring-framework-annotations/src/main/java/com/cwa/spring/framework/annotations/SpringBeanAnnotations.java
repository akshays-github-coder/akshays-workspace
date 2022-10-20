package com.cwa.spring.framework.annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public class SpringBeanAnnotations {

	@ComponentScan
	@Configuration
	@Component
	@Service
	@Repository
	@Controller
}
