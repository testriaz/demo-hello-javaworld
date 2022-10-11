package com.demo.helloworld.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EngineerController {
	private static final Logger logger = LoggerFactory.getLogger(EngineerController.class);

	@GetMapping (value="/")
	@CrossOrigin(origins="*")
	public String getMessage(){
		return "Hello World!!!";
	}

	@GetMapping (value="/test")
	@CrossOrigin(origins="*")
	public String getMessageTest(){
		return "Hello Test World!!";
	}

}
