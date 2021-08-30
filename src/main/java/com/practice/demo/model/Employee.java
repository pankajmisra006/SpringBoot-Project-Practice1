package com.practice.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private int epmid;
	private String empname;
	private String empactive;
	private String empsalary;
	
	 
	
	public Employee() {
		super();
		System.out.println("Object Created!!");
		// TODO Auto-generated constructor stub
	}
	
	public int getEpmid() {
		return epmid;
	}

	public void setEpmid(int epmid) {
		this.epmid = epmid;
	}


	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpactive() {
		return empactive;
	}
	public void setEmpactive(String empactive) {
		this.empactive = empactive;
	}
	public String getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(String empsalary) {
		this.empsalary = empsalary;
	}
	
	public void show() { 
		System.out.println("calling employee");
	} 
	

}
