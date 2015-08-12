package org.quan.controller;

import org.apache.log4j.Logger;
import org.quan.model.Test;
import org.quan.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
