package com.fullstack.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.demo.dto.EmployeeRequestDTO;
import com.fullstack.demo.dto.EmployeeResponseDTO;


@RestController
@RequestMapping("/employees") // to map the controller
public class EmployeeController {
	
	@PostMapping //this annotation is used to define the post method
	public EmployeeResponseDTO saveEmployee(@RequestBody EmployeeRequestDTO emploDto) {
		return null;
	}
	
	@GetMapping
	public List<EmployeeResponseDTO> findAllEmployees(){
		return null;
	}
}
