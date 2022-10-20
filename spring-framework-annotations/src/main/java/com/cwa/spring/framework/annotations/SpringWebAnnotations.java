package com.cwa.spring.framework.annotations;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.Mapping;

import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;


public class SpringWebAnnotations {
	
	@RequestMapping
	@RequestBody
	@RequestAttribute
	@RequestHeader
	@RequestParam
	@Required
	@RequestPart
	@RequestScope
	@GetMapping
	@Mapping
	
	@PathVariable
	
//	Response Handling Annotations
	@ResponseBody
	@ExceptionHandler
	@ResponseStatus
	
	@ApplicationScope
	@SessionScope

	@RestController
	@RestControllerAdvice
	@ControllerAdvice
	
	@ModelAttribute
	@CrossOrigin
}
