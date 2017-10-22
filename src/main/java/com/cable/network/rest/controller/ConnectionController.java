package com.cable.network.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cable.network.domain.DishConnection;
import com.cable.network.iservice.IDishConnectionService;

@RestController
public class ConnectionController {
	
	@Autowired
	private IDishConnectionService dishConnectionService;
	
	@RequestMapping(value = "/dish/add-connection",method = RequestMethod.POST)
	public String addConnection(@RequestBody DishConnection dishConnection) {
		return dishConnectionService.addConnection(dishConnection);
	}
	
	@RequestMapping(value = "/dish/get-connection",method = RequestMethod.GET)
	public DishConnection getDishConnection(@RequestParam String connectionId) {
		return dishConnectionService.findByConnectionId(connectionId);
		
	}
	
	@RequestMapping(value = "/dish/get-connection/{name}",method = RequestMethod.POST)	
	public List<DishConnection> getDishConnectionByName(@PathVariable("name") String name) {
		return dishConnectionService.findByName(name);
	}
	
	@RequestMapping(value = "/dish/modify-connection",method = RequestMethod.PUT)
	public String modifyDishConnection(@RequestBody DishConnection dishConnection) {
		return dishConnectionService.modifyDishConnection(dishConnection);
	}
	
	@RequestMapping(value = "/dish/get-all-connections",method = RequestMethod.GET)
	public List<DishConnection> getAllDishConnections() {
		return dishConnectionService.findAllConnections();
		
	}
	
}
