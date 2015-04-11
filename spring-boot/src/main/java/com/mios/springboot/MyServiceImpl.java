package com.mios.springboot;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

	public String getDatosService1() {
		return "service1";
	}
}
