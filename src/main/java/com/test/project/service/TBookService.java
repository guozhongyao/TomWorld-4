/**
 * 
 */
package com.test.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.project.entity.TBook;
import com.test.project.repository.TBookRepository;

/**
 * @description:
 *
 * @author guozh
 * @date 2018年2月24日下午4:22:36
 * 
 */
@Service
public class TBookService {
	@Autowired
	private TBookRepository repo;

	public String testBook() throws Exception {
		try {
			repo.save(new TBook("植物学3"));
		} finally {
			throw new Exception("抛出异常");
		}

	}
}
