package com.wordpress.babuwant2do.microservice.serviceb.microserviceb.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resource-b")
public class ServiceBResource {

	@RequestMapping("/welcome/{name}")
	public ResponseEntity<String> welcome(@PathVariable String name){
		return ResponseEntity.ok("we would like to invite you ("+ name +") from resource B.");
	}
}
