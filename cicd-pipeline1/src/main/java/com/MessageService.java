package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageService {
	
	@GetMapping("/caps/{str1}")
	public String caps(@PathVariable("str1") String str1) {
		return str1.toUpperCase();
	}
	
	@GetMapping("/low/{str1}")
	public String low(@PathVariable("str1") String str1) {
		return str1.toLowerCase();
	}
	
	@GetMapping("/con/{str1}/{str2}")
	public String con(@PathVariable("str1") String str1, @PathVariable("str2") String str2) {
		return str1.concat(str2);
	}
	

	@GetMapping("/sub/{str1}/{num1}/{num2}")
	public String sub(@PathVariable("str1") String str1, @PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
		return str1.substring(num1,num2);
	}
	
	@GetMapping("/len/{str1}")
	public int len(@PathVariable("str1") String str1) {
		return str1.length();
	}

}