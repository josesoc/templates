package com.mios.templates.spring4;

import static org.junit.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mios.templates.spring4.config.Config;
import com.mios.templates.spring4.service.MyService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Config.class)
@WebAppConfiguration
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AppTest
{
	@Autowired
	MyService myService; 
	
    @Test
    public void testApp()
    {
    	assertTrue(myService.getDatosService1().length() > 0);
    }
}
