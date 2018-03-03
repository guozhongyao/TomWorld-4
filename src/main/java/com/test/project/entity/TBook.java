package com.test.project.entity;
// Generated 2018-2-28 9:16:57 by Hibernate Tools 5.2.8.Final

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "t_book", catalog = "hello")
public class TBook implements java.io.Serializable {

	private static final long serialVersionUID = 1287933149748746468L;
	private Integer id;
	private String bookName;

	public TBook() {
	}

	public TBook(String bookName) {
		this.bookName = bookName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "book_name", length = 100)
	public String getBookName() {
		return this.bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
