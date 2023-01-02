package com.example.springboot2githubactions.controller;

import com.example.springboot2githubactions.entity.PersonEntity;
import com.example.springboot2githubactions.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/${spring.application.name}")
public class PersonController {

	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	private PersonService personService;

	@GetMapping(value = "/persons", consumes = "application/json")
	private List<PersonEntity> getAllPersons() {
		List<PersonEntity> persons =  personService.getAllPersons();
		logger.info("Adding some logs. List size: {}", persons.size());
		return persons;
	}
}
