package com.fullstack.demo.service;

import java.util.List;
import java.util.Optional;

import com.fullstack.demo.entity.Employee;
import com.fullstack.demo.exception.EmployeeNotFoundException;

public interface EmployeeService {
	public Employee saveEmployee(Employee emp);
	public Employee findById(long employeeId) throws EmployeeNotFoundException;
	public List<Employee> getAllEmployees();
//	public List<Employee> getAllEmployeeStartsWith(String name);
//	public List<Employee> getAllEmployeesLastNamesLike(String lastName);
}
