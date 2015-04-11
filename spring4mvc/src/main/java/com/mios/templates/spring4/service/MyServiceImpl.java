package com.mios.templates.spring4.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

	public String getDatosService1() {
		return "service1";
	}
}
