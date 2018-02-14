package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	private static Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@RequestMapping("/sayHello")
	public String sayHello() {
		logger.info("sayHello is called.");
		return ("Hi!!! This is TestController sayHello");
	}

}
