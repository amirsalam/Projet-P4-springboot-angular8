package com.youcode.controllers;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.youcode.entity.Admin;

@CrossOrigin()
@RestController
@RequestMapping({ "/login" })

public class AdminController {
	
	@GetMapping(produces = "application/json")
	@RequestMapping({ "/validateLogin" })
	public Admin validateLogin() {
		
		return new Admin("admin","admin","User successfully authenticated");
	}

}
