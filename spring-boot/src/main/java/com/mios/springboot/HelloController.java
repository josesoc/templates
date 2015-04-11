package com.mios.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	static Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping(method=RequestMethod.GET,value="/hello")
	public String sayHello() {
		logger.debug("<<< HelloController.sayHello");
		return "Greetings from HelloController! ";
	}
}
