package com.fullstack.demo.exception;

public class EmployeeNotFoundException extends RuntimeException{
	private long id;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public EmployeeNotFoundException(long id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "EmployeeNotFoundException [id=" + id + "]";
	}
	
	

}
