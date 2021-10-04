package com.moglix.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.repository.EmployeeDAO;
import com.moglix.employeemanagementsystem.repository.EmployeeRepository;
import com.moglix.employeemanagementsystem.repository.EmployeeRepositoryImpl;

@Component
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
//	
//	private  EmployeeServiceImpl() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	private static EmployeeService employeeService;
//	
//	public static EmployeeService getInstance() {
//		if(employeeService==null) {
//			employeeService=new EmployeeServiceImpl();
//			return employeeService;
//			}
//		else {
//			return employeeService;
//		}
//	}

	@Override
	public String addEmployee(Employee employee) {
		// service is consuming dao method
				return employeeRepository.addEmployee(employee);
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		return employeeRepository.updateEmployee(id, employee);
	}

	@Override
	public Employee getEmployeeById(String id) {
		return employeeRepository.getEmployeeById(id);
		
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.getEmployees();
	}

	@Override
	public String deleteEmployeeById(String id) {
		return employeeRepository.deleteEmployeeById(id);
	}

	@Override
	public void deleteAllEmployees() {
		employeeRepository.deleteAllEmployees();

	}

}
