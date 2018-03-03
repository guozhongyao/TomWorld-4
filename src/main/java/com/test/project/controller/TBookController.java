/**
 * 
 */
package com.test.project.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.project.entity.TBook;
import com.test.project.repository.TBookRepository;
import com.test.project.service.TBookService;

/**
 * @description:
 *
 * @author guozh
 * @date 2018年2月24日下午3:34:32
 * 
 */
@RestController
public class TBookController {
	private static final Logger logger = LoggerFactory.getLogger(TBookController.class);
	@Autowired
	private TBookRepository repo;
	@Autowired
	private TBookService service;

	@RequestMapping(value = "/test/001")
	public String test() throws JsonProcessingException {
		List<TBook> list = repo.findAll();
		ObjectMapper objMapper = new ObjectMapper();
		return objMapper.writeValueAsString(list);
	}

	@RequestMapping(value = "/test/002")
	public String test2() throws JsonProcessingException {
		TBook book_test = repo.findByBookName("数学");
		ObjectMapper objMapper = new ObjectMapper();
		// string test = "yuyu";
		return objMapper.writeValueAsString(book_test);
	}

	@RequestMapping(value = "/test/003")
	@Transactional(rollbackOn = Exception.class)
	public String test3() throws Exception {
		return service.testBook();
	}
}
