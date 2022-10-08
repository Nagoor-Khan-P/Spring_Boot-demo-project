package com.fullstack.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class EmployeeRequestDTO {
	private String firstName;
	private String lastName;
	private String email;
	private long mobile;
	private String designation;
}
