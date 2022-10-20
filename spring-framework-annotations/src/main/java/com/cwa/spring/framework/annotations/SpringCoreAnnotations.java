package com.cwa.spring.framework.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

public class SpringCoreAnnotations {
	
	@Autowired
	@Qualifier
	@Primary
	@Bean
	@Lazy
	@Required
	@Value
	@Scope
	@Lookup
	
	@Profile
	@Import
	@ImportResource
	@PropertySource

}
