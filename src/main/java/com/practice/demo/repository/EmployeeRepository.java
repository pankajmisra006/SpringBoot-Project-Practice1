package com.practice.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practice.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	
	public Employee findByepmid(int emid);
	public String deleteByempname(String empname);
	public List<Employee> findByempname(Object empname);
	
	
}
