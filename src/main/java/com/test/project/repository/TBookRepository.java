/**
 * 
 */
package com.test.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.project.entity.TBook;

/**
 * @description:
 *
 * @author guozh
 * @date 2018年2月24日下午3:33:28
 * 
 */
public interface TBookRepository extends JpaRepository<TBook, Integer> {

	public TBook findByBookName(String bookName);
}
