package com.cable.network.iservice;

import java.util.List;

import com.cable.network.domain.Employee;

public interface IEmployeeService {

	public String addEmployee(Employee employee);
	public Employee findByEmployeeId(String employeeId);
	public List<Employee> findByName(String name);
	public String modifyDishConnection(Employee employee);

}
