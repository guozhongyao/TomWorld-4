/**
 * 
 */
package com.test.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.project.entity.TestPerson;
import com.test.project.repository.TestPersonRepository;

@RestController
public class TestPersonController {
	@Autowired
	private TestPersonRepository repo;

	@RequestMapping(value = "test/person/001")
	public String test() {
		TestPerson persn = new TestPerson("abc", 60, "男", "jsldljlfd");
		repo.save(persn);
		return "tomcat";
	}

	@RequestMapping(value = "test/person/002")
	public String test2() {
		Long jilu = repo.count();
		boolean isExistsId = repo.exists(5);
		Long num = repo.countByPersonName("tom");
		return "num: " + num + "\njilu: " + jilu + "\nisExistsId: " + isExistsId;
	}

	@RequestMapping(value = "test/person/003")
	public String test3() throws JsonProcessingException {
		TestPerson persn = new TestPerson();
		persn.setPersonDescrib("jsldljlfd");
		Example<TestPerson> example = Example.of(persn);
		List<TestPerson> list = repo.findAll(example);
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(list);
	}

}
