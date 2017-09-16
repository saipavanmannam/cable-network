package com.cable.network.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/dish/welcome")
	public String welcomeMessage() {
		return "Welcome to Cable Network Application By SaiPavn...";
	}
}
