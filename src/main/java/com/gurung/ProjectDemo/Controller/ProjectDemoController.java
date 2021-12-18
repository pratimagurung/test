package com.gurung.ProjectDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p")
public class ProjectDemoController {
	
	@GetMapping("/greet")
	public String Greet() {
		return "Hello Devops";
	}
	
	
}
