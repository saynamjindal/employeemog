package com.moglix.employeemanagementsystem.service;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.repository.EmployeeDAO;

public class EmployeeServiceDemo {
	
	EmployeeDAO employeeDAO= new EmployeeDAO();
	
	
	public String addEmployee(Employee employee) {
		
		// service is consuming dao method
		return employeeDAO.addEmployee(employee);
		
				
	}
	
	public Employee getEmployeeById(String empId) {
		return employeeDAO.getEmployeeById(empId);
		
	}
	
	public Employee[] getEmployees() {
		return employeeDAO.getEmployees();
		
	}
	public void deleteAllEmployees() {
		employeeDAO.deleteAllEmployees();
	}
	public String addupdateEmployee(String empId, Employee employee1) {
		return employeeDAO.updateEmployee(empId, employee1);
		
	}
}
