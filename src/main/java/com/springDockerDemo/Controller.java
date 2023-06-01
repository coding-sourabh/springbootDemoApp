package com.springDockerDemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class Controller {
	@GetMapping(value = "/")
	ResponseEntity<String> generalResp() {
		return new ResponseEntity<>("Hello, this is a spring boot application built and deployed by sourabh", HttpStatus.OK);
	}
}
