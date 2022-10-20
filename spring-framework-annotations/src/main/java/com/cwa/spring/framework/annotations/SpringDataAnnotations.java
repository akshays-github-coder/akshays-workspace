package com.cwa.spring.framework.annotations;

import java.lang.annotation.Documented;

import javax.transaction.Transactional;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Transient;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

public class SpringDataAnnotations {
	
//	Common Spring Data Annotations
	@Transactional
	@NoRepositoryBean
	@Param
	@Id
	@Transient
	@LastModifiedBy
	@CreatedBy
	@CreatedDate
	@LastModifiedBy
	@LastModifiedDate
	
//	Spring Data JPA Annotations
	@Query
	@Procedure
	@Lock
	@Modifying
	@EnableJpaRepositories
	
//	Spring Data Mongo Annotations
	@Document
	@org.springframework.data.mongodb.repository.Query
	@EnableMongoRepositories
	@Field

}
