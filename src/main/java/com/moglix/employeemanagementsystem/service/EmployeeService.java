package com.moglix.employeemanagementsystem.service;

import java.util.List;

import com.moglix.employeemanagementsystem.dto.Employee;

public interface EmployeeService {
	
	
	public String addEmployee(Employee employee);
	public String updateEmployee(String id,Employee employee);
	public Employee getEmployeeById(String id);
	public List<Employee> getEmployees();
	public String deleteEmployeeById(String id);
	public void deleteAllEmployees();
	
}
