package com.project.employeeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.employeeapp.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	
}
