package com;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.entity.Employee;


public class Company implements Serializable {
	private static final long serialVersionUID = -576373386878327387L;

	
	private List<Employee> employees;

	public Company() {
		this.employees = new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		this.employees.add(employee);
	}

	public List<Employee> getEmployees() {
		return employees;
	}

}
