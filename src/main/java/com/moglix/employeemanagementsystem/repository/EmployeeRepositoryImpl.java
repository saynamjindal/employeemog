package com.moglix.employeemanagementsystem.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.moglix.employeemanagementsystem.dto.Employee;

@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	
//	private EmployeeRepositoryImpl() {
//		
//	}
//	public static EmployeeRepository getInstance() {
//		if(employeeRepository==null) {
//			employeeRepository=new EmployeeRepositoryImpl();
//			return employeeRepository;
//			}
//		else {
//			return employeeRepository;
//		}
//		
//	}
	@Autowired
	private static EmployeeRepository employeeRepository;
	
	private static int counter=0;
	
	private List<Employee> employees = new ArrayList<>();

	@Override
	public String addEmployee(Employee employee) {
		boolean result= employees.add(employee);
		if(result)
			return "Success";
		return "fail";
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
//		int index = this.getIndex(id);
//		if(index!=-1) {
//			employees[index]=employee;
//			return "success";
//		}
//		else
		Employee employee1 =this.getEmployeeById(id);
		if(employee1!=null) {
			employees.remove(employee1);
			employees.add(employee);
			return "updated";
		}
		else
			return "not found";
		
	
	}

	@Override
	public Employee getEmployeeById(String id) {

		for (Employee employee : employees) {
			
			if(id.equals(employee.getEmpID())){
				return employee;
			}
		}
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		return employees;
		
	}
	
	private int getIndex(String id) {
//		for (int i = 0; i < employees.length; i++) {
//			if(employees[i].getEmpID().equals(id)) {
//				return i;
//			}
//		}
		return -1;
	}
	@Override
	public String deleteEmployeeById(String id) {
		Employee employee =this.getEmployeeById(id);
//		//we will get the employee which we want to delete
//		
//		int index=this.getIndex(id);
//		
//		if(index!=-1) {
//			employees[index]=null;
//			return "delete success ";
//		}
//		return "deletion failed! User not found";
		
		if(employee!=null) {
			if(employees.remove(employee)) {
				return "delete success";
			}
			else
				return "fail";
		}
		else
			return "not found";
		
		
		
	}

	@Override
	public void deleteAllEmployees() {
		employees.clear();

	}

}
