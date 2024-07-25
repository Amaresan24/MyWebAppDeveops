package com.example.web_application.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webApplicationController {

	@GetMapping(value = "/web")
	public String getWeb() {
		return "This my first jar file";
	}
	
	
}
