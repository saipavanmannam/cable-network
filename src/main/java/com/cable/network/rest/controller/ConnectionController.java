package com.cable.network.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cable.network.domain.Employee;
import com.cable.network.iservice.IEmployeeService;

@RestController
public class ConnectionController {
	
	@Autowired
	private IEmployeeService employeeService;
	
	@RequestMapping(value = "/dish/add-employee",method = RequestMethod.POST)
	public String addConnection(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	@RequestMapping(value = "/dish/get-employee",method = RequestMethod.POST)
	public Employee getEmployee(@RequestParam String employeeId) {
		return employeeService.findByEmployeeId(employeeId);
		
	}
	
	@RequestMapping(value = "/dish/get-employee/{name}",method = RequestMethod.POST)	
	public List<Employee> getEmployeeByName(@PathVariable("name") String name) {
		return employeeService.findByName(name);
	}
	
	@RequestMapping(value = "/dish/modify-employee",method = RequestMethod.PUT)
	public String modifyEmployee(@RequestBody Employee employee) {
		return employeeService.modifyDishConnection(employee);
	}
}
