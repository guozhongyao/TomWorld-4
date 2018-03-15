/**
 * 
 */
package com.test.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.test.project.entity.TbTest;
import com.test.project.repository.TbTestRepository;

@RestController
public class TbTestController {
	@Autowired
	private TbTestRepository repo;

	@RequestMapping(value = "tb/test/001")
	public String test() throws JsonProcessingException {

		TbTest test = new TbTest("kooy", "second", "c,d,f");
		TbTest tb = repo.save(test);
		System.out.println(tb.toString());
		return "tomcat";
	}

	@RequestMapping(value = "tb/test/002")
	public String test2() throws JsonProcessingException {
		TbTest test = new TbTest("kooy", "second", "c,d,f");
		TbTest tb = repo.save(test);
		System.out.println(tb.toString());
		return "tomcat2";
	}

}
