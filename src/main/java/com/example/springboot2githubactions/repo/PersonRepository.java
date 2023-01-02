package com.example.springboot2githubactions.repo;

import com.example.springboot2githubactions.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository  extends JpaRepository<PersonEntity, Integer> {

}
