/**
 * 
 */
package com.test.project.controller;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.project.entity.TTeacher;
import com.test.project.repository.TTeacherRepository;

@RestController
public class TTeacherController {
	@Autowired
	private TTeacherRepository repo;

	@RequestMapping(value = "teacher/test/001")
	public String test() throws JsonProcessingException {
		List<TTeacher> list = repo.findAll();
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(list);
	}

	@PostMapping(value = "teacher/test/002")
	public String insert(@RequestBody Map<String, String> map) throws ParseException {

		String name = map.get("name");
		String age = map.get("age");
		String sex = map.get("sex");
		String date = map.get("createDate");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date2 = sdf.parse(date);
		TTeacher teacher = new TTeacher(name, age, sex, date2);
		repo.save(teacher);
		return "success";
	}

	public static void main(String[] args) {
		byte[] arrays = "1234".getBytes();
		InputStream input  = new ByteArrayInputStream(arrays);
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		StringBuilder sb = new StringBuilder();
		String temp = null;
		try {
			while ((temp = reader.readLine()) != null) {
				sb.append(temp);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
