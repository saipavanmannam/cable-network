package com.cable.network.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {
	
	@RequestMapping({"/","/connection"})
	public String modifyDishConnection() {	
		return "forward:/index.html";
	}
}
