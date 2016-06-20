package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.AdminDAO;









@Controller
public class AdminController {

   @Autowired
	AdminDAO login;


	@RequestMapping("/isValidAdmin")
	public ModelAndView showMessage(@RequestParam(value = "adminname") String name,
			@RequestParam(value = "password") String password) {
		System.out.println("in controller");

		String message;
		ModelAndView mv ;
		if (login.isValidAdmin(name, password)) 
		{
			message = "Valid credentials";
			 mv = new ModelAndView("home");
		} else {
			message = "Invalid credentials";
			 mv = new ModelAndView("signin");
		}

		mv.addObject("message", message);
		mv.addObject("name", name);
		
		return mv;
	}

}


