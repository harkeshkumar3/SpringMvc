package com.harkesh.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.harkesh.model.User;
import com.harkesh.service.UserService;

@Controller
public class UserContoller {
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String showPage( User user ,ModelMap map ) {
		
		userService.create(user);
		return "welcome";
	}
	
	

}
