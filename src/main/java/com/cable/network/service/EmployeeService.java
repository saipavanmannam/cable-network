/**
 * 
 */
package com.cable.network.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cable.network.domain.Employee;
import com.cable.network.iservice.IEmployeeService;
import com.cable.network.repository.EmployeeRepository;

/**
 * @author saipavan
 *
 */
@Service
public class EmployeeService implements IEmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
	public String addEmployee(Employee employee) {
		return employeeRepo.save(employee)!=null ? "SUCESS" : "FAIL";
	}

	
	@Override
	public Employee findByEmployeeId(String employeeId) {
		return employeeRepo.findByEmployeeId(employeeId);
	}

	
	@Override
	public List<Employee> findByName(String name) {
		List<Employee> employees = employeeRepo.findAll();
		return employees.stream().filter(t->t.getName().equals(name)).collect(Collectors.toList());
	}

	@Override
	public String modifyEmployee(Employee employee) {
		return employeeRepo.save(employee)!=null ? "SUCESS" : "FAIL";
	}

}
