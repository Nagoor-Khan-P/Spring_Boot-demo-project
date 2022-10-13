package com.fullstack.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.demo.dto.EmployeeRequestDTO;
import com.fullstack.demo.dto.EmployeeResponseDTO;
import com.fullstack.demo.entity.Employee;
import com.fullstack.demo.service.EmployeeService;


@RestController
@RequestMapping("/employees") // to map the controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;//it will give the EmployeeServiceImpl object injected in IOC container
	
	@Autowired
	private ModelMapper mapper;
//	it will give the mapper object wich converts DTO to Entity classes
	
	@PostMapping //this annotation is used to define the post method
	public EmployeeResponseDTO saveEmployee(@RequestBody EmployeeRequestDTO emploDto) {
		Employee emp=mapper.map(emploDto, Employee.class);
		Employee employee = employeeService.saveEmployee(emp);
		EmployeeResponseDTO employeeResponseDTO=mapper.map(employee, EmployeeResponseDTO.class);
		return employeeResponseDTO;
	}
	
	@GetMapping("/{eid}")
	public EmployeeResponseDTO findEmployeeById(@PathVariable long eid) {
		Employee emp=employeeService.findById(eid);
		EmployeeResponseDTO employeeResponseDTO=mapper.map(emp, EmployeeResponseDTO.class);
		return employeeResponseDTO;
	}
	
	@GetMapping("/getAll")
	public List<EmployeeResponseDTO> findAllEmployees(){
		List<Employee> employees = employeeService.getAllEmployees();
		List<EmployeeResponseDTO> employeeResponseDTOs = employees.stream().map(employee -> mapper.map(employee, EmployeeResponseDTO.class)).collect(Collectors.toList());
		
		return employeeResponseDTOs;
	}
}
