package com.mios.templates.spring4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mios.templates.spring4.service.MyService;

/**
 *
 * @author john
 */
@Controller
public class DefaultController {
    
   @Autowired
   MyService myService; 
   
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String index(ModelMap map) {
       map.put("msg", myService.getDatosService1());
       return "index";
   }
    
}
