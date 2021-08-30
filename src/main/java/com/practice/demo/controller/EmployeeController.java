package com.practice.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.demo.model.Employee;
import com.practice.demo.repository.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired 
	EmployeeRepository employeerepository;
	
	@GetMapping("/login")
	public String login() {
		System.out.println("coming");
		return "login";
	}
	
	@GetMapping("/")
	public String home() {
		return("<h2>Welcome user</h2>");
	}
	
	
	@PutMapping("/createemployee")
	public String createemployee(@RequestBody Employee employee) {
		
		employeerepository.save(employee);
		return "Employee created"; 
	}
	
	@GetMapping("/getallemployee")
	public List<Employee> getallemployee() {
		
	return employeerepository.findAll();
	}
	
	@GetMapping("/getempbyid/{empid}")
	public Employee getempbyid(@PathVariable int empid) {
		
	return employeerepository.findByepmid(empid);
	}
	
	@DeleteMapping("/deleteemployee/{empname}")
	public List<Employee>  deleteemployee(@PathVariable Object empname ) {
		
		List<Employee> obj=employeerepository.findByempname(empname);
		for(Employee emp:obj) {
			employeerepository.delete(emp);
			
		}
		return employeerepository.findAll();
		}

	
	@PostMapping("/updateall")
	public Employee updateall(@RequestBody Employee employee) {
		
	Employee obj=employeerepository.findByepmid(employee.getEpmid());
   if(obj!=null) { 
	   obj.setEmpname(employee.getEmpname());
	   obj.setEmpactive(employee.getEmpactive());
	   obj.setEmpsalary(employee.getEmpsalary());
	   employeerepository.save(obj);
   }else {
	   
	   System.out.println("usernot available");
   }
	 return obj;
	
	}

}
