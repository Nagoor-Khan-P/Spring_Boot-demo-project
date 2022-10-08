package com.fullstack.demo.service;

import java.util.List;

import com.fullstack.demo.entity.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee emp);
	public List<Employee> getAllEmployees();
}
