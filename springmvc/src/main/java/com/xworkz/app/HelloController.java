package com.xworkz.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller//automatically Extends Httpservlet
public class HelloController {

	//InternalResourceViewResolver;
	//DispatcherServlet
	
	@RequestMapping(value ="/homemsg",method = RequestMethod.POST)//"helloworld")  //any one requestmapping or postmapping should be used
	//@PostMapping(value = "helloworld")
	public ModelAndView home1() {//m1(@ModelAttribute HelloWorld hello) {
		System.out.println("----------home-----------");
		//System.out.println("-------------message--------------" +hello.getMessage());
		//String msg=hello.getMessage()+"to xworkz";
		//ModelAndView holds info of view and data 
		//1st para is ViewName
		//2nd para is modelName which we have defined in jsp page with dollar symbol{}
		//3rd para actual value or object
		//return new ModelAndView("success", "msgkey", msg); //ModelView with viewname(page),modelname(key),modelobject -3 parameter
		ModelAndView model=new ModelAndView("success");
		model.addObject("message","hello welcome home");
		return  model;
	}
}
