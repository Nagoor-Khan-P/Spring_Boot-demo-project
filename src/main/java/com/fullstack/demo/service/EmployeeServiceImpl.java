package com.fullstack.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fullstack.demo.entity.Employee;
import com.fullstack.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Transactional
	@Override
	public Employee saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return employeeRepository.save(emp);
	}
	
	@Transactional
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}
	
	@Transactional
	@Override
	public Employee findById(long employeeId) {
		// TODO Auto-generated method stub
		Optional<Employee> employee=employeeRepository.findById(employeeId);
		if(employee.isPresent()) {
			return employee.get();
		}
		return employee.get();
	}
	
//	@Transactional
//	@Override
//	public List<Employee> getAllEmployeeStartsWith(String name) {
//		// TODO Auto-generated method stub
//		return employeeRepository.getAllEmployeeStartsWith(name);
//	}
//	
//	@Transactional
//	@Override
//	public List<Employee> getAllEmployeesLastNamesLike(String lastName) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
