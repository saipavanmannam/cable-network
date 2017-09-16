package com.cable.network.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cable.network.domain.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {

	public Employee findByEmployeeId(String employeeId);

}
