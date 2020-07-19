package com.mvc.pjt.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.pjt.model.User;
import com.mvc.pjt.service.UserService;
import com.mvc.pjt.service.impl.UserServiceImpl;

@Controller
public class RegisterController {

//	@Autowired
	UserService userService = new UserServiceImpl();
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public ModelAndView test(HttpServletResponse response, @ModelAttribute("user") User user) throws IOException{
		User userResp = userService.register(user);
		if (userResp == null) {
			ModelAndView model = new ModelAndView("error");
			model.addObject("errorMessage", "Unable to register user");
//			return new ModelAndView("error", "errorMessage", "Unable to register user");
			return model;
		}
		return new ModelAndView("	", "firstname", userResp.getFirstname());
	}
}
