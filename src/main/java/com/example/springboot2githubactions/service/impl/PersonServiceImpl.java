package com.example.springboot2githubactions.service.impl;

import com.example.springboot2githubactions.entity.PersonEntity;
import com.example.springboot2githubactions.repo.PersonRepository;
import com.example.springboot2githubactions.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;

	public List<PersonEntity> getAllPersons() {
		return new ArrayList<>(personRepository.findAll());
	}
}
