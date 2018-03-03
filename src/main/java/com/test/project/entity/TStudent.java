package com.test.project.entity;
// Generated 2018-2-28 9:16:57 by Hibernate Tools 5.2.8.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * TStudent generated by hbm2java
 */
@Entity
@Table(name = "t_student", catalog = "hello")
public class TStudent implements java.io.Serializable {

	private Integer stuId;
	private String stuName;
	private BigDecimal stuLength;
	private String stuSex;
	private Date stuBirthday;

	public TStudent() {
	}

	public TStudent(String stuName, BigDecimal stuLength) {
		this.stuName = stuName;
		this.stuLength = stuLength;
	}

	public TStudent(String stuName, BigDecimal stuLength, String stuSex,
			Date stuBirthday) {
		this.stuName = stuName;
		this.stuLength = stuLength;
		this.stuSex = stuSex;
		this.stuBirthday = (Date) stuBirthday.clone();
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "stu_id", unique = true, nullable = false)
	public Integer getStuId() {
		return this.stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	@Column(name = "stu_name", nullable = false, length = 100)
	public String getStuName() {
		return this.stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	@Column(name = "stu_length", nullable = false, precision = 60, scale = 0)
	public BigDecimal getStuLength() {
		return this.stuLength;
	}

	public void setStuLength(BigDecimal stuLength) {
		this.stuLength = stuLength;
	}

	@Column(name = "stu_sex", length = 50)
	public String getStuSex() {
		return this.stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "stu_birthday", length = 10)
	public Date getStuBirthday() {
		return (Date) this.stuBirthday.clone();
	}

	public void setStuBirthday(Date stuBirthday) {
		this.stuBirthday = (Date) stuBirthday.clone();
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}

}