/**
 * 
 */
package com.test.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.project.entity.TestPerson;

/**
 * @description:
 *
 * @author guozh
 * @date 2018年2月24日下午3:33:28
 * 
 */
public interface TestPersonRepository extends JpaRepository<TestPerson, Integer> {

	public TestPerson findByPersonName(String name);

	public long countByPersonName(String personName);
}
