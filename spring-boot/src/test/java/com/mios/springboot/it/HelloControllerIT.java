package com.mios.springboot.it;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.mios.springboot.Application;

/**
 * HelloControllerIT - Integration Tests
 * 
 * @author jmroldanv
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@WebIntegrationTest
public class HelloControllerIT 
{
	static Logger logger = LoggerFactory.getLogger(HelloControllerIT.class);
	
	RestTemplate restTemplate = new TestRestTemplate();
	final String BASE_URL = "http://localhost:8080/hello";
	
    @Test
    public void testApp()
    {
    	logger.debug("<<< Integration Test - testApp");
    	
    	ResponseEntity<String> response = restTemplate.getForEntity(BASE_URL, String.class);
    	
		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    	assertThat(response.getBody(), containsString("Greetings") );
    }
}
