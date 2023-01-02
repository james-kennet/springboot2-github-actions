package com.example.springboot2githubactions.service;

import com.example.springboot2githubactions.entity.PersonEntity;

import java.util.List;

public interface PersonService {

	List<PersonEntity> getAllPersons();
}
