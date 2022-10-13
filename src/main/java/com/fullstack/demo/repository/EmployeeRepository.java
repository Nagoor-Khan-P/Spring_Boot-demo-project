package com.fullstack.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fullstack.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
//	@Query(value = "select e from Employee e where e.firstName like :name%")
//	List<Employee> getAllEmployeeStartsWith(@Param("name") String name);
//	
//	@Query(value = "select e from Employee e where e.lastName like %:name%")
//	List<Employee> getAllEmployeesLastNamesLike(String lastName);
}
