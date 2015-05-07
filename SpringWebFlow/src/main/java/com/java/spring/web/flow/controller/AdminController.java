package com.java.spring.web.flow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	
	@RequestMapping({"/admin","/admin/"})
	public String getPageAdmin(){
		return "admin/index";
	}
}
