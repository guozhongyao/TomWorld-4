/**
 * 
 */
package com.test.project.controller;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @description:
 *
 * @author guozh
 * @date 2018年3月9日下午4:08:16
 * 
 */
@RestController
public class Test2Controller {

	@GetMapping("test2/002")
	public String test2() {
		return "hfhiuehfrjfks7894593845";
	}

	@PostMapping("test2/003")
	public String test3(@RequestParam String username, @RequestParam String password) {

		return "username=" + username + "password=" + password;
	}

	@PostMapping("test2/004")
	public String test4(@RequestBody String  json)
			throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		@SuppressWarnings("unchecked")
		Map<String, String> map = mapper.readValue(json, Map.class);
		StringBuilder sb = new StringBuilder();
		for (Entry<String, String> entry : map.entrySet()) {
			sb.append(entry.getKey()).append("=").append(entry.getValue()).append("\n");
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		return sb.toString();
	}

}
