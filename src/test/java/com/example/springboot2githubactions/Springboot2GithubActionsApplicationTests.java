package com.example.springboot2githubactions;

import com.example.springboot2githubactions.controller.PersonController;
import com.example.springboot2githubactions.repo.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
class Springboot2GithubActionsApplicationTests {

	@MockBean
	private PersonRepository personRepository;

	@Autowired
	private PersonController personController;

	@Test
	void contextLoads() {
		assertThat(personController).isNotNull();
	}

}
