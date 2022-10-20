package com.cwa.spring.framework.annotations;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.web.servlet.ConditionalOnMissingFilterBean;

import org.springframework.context.annotation.Conditional;

@SpringBootApplication
@EnableAutoConfiguration
@Conditional(value = { })
@ConditionalOnBean
@ConditionalOnMissingBean
@ConditionalOnMissingFilterBean
@ConditionalOnClass
@ConditionalOnMissingClass
@ConditionalOnProperty
@ConditionalOnResource
@ConditionalOnWebApplication
@ConditionalOnNotWebApplication
@ConditionalOnExpression
public class SpringBootAnnotations {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotations.class, args);
	}

}
