package com.mios.springboot;

import static org.junit.Assert.assertTrue;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * AppWebTest - Unit Web Tests
 * 
 * @author jmroldanv
 * 
 * Spring Boot configures the Surefire plugin to run all test classes that have a name ending with Test 
 * or Tests but not starting with Abstract. 
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WebAppConfiguration
public class AppUnitWebTest 
{
	static Logger logger = LoggerFactory.getLogger(AppUnitWebTest.class);
	
	@Autowired
	MyService myService; 
	
    @Test
    public void testWebApp()
    {
    	logger.debug("<<< Unit Web Test - testWebApp");

    	//assertTrue(myService.getDatosService1().length() > 0);
    }
}
