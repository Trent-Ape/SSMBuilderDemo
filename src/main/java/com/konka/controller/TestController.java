package com.konka.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.konka.model.Test;
import com.konka.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {
	private final Logger log = Logger.getLogger("TestController");
	
	@Autowired
	TestService testService;
	
	@RequestMapping("/test")
	public String test(){
		log.info("test");
		Test test = new Test();
		test.setName("test1");
		testService.query(test);
		testService.insert(test);
		return "redirect:/index.jsp";
	}
}
