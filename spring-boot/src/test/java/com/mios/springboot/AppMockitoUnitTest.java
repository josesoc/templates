package com.mios.springboot;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AppMockitoUnitTest - Unit Tests
 * 
 * No carga el contexto, por eso no puede hacer @Autowired para obtener instancias de beans cargados
 * en el contexto. 
 * Estos Test solo usan Mocks.
 * 
 * @author jmroldanv
 * 
 * Spring Boot configures the Surefire plugin to run all test classes that have a name ending with Test 
 * or Tests but not starting with Abstract. 
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class AppMockitoUnitTest 
{
	static Logger logger = LoggerFactory.getLogger(AppMockitoUnitTest.class);
	
	@Mock
	MyServiceImpl myService; 
	
    @Test
    public void testApp()
    {   
    	when(myService.getDatosService1()).thenReturn("OK service1");
    	
    	logger.debug("<<< Mockito Unit Test - testApp");
    	assertThat(myService.getDatosService1(), containsString("service1"));
    	
    	//Verifica que lo ha llamado
    	verify(myService).getDatosService1();
    }
}
