package com.moglix.employeemanagementsystem;

import java.util.List;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.repository.EmployeeDAO;
import com.moglix.employeemanagementsystem.service.EmployeeService;
import com.moglix.employeemanagementsystem.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		EmployeeService employeeService =  EmployeeServiceImpl.getInstance();
		
		
		Employee employee = new Employee();
		
		employee.setEmpID("ab001");
		employee.setEmpFirstName("saynam");
		employee.setEmpLastName("Jindal");
		employee.setEmpPan("AWUC0898TY");
		employee.setEmpSalary(35000);
		employee.setEmpAddress("198/19, s.d puram");
		employee.setEmpAadhar("1233 4567 8906");
		
		System.out.println(employee.getEmpID());
		System.out.println(employee.getEmpFirstName());
		
			
		
		

		
		String result1=employeeService.addEmployee(employee);
		System.out.println(result1);
		
		List<Employee> yut=employeeService.getEmployees();
		
		for (Employee employee3 : yut) {
		 	if(employee3!=null) {
				System.out.println(employee3);
				System.out.println(employee3.toString());
			}
		}
		

		
		
		Employee employee2=employeeService.getEmployeeById("ab001");
		
		
		if(employee2==null)
			System.out.println("employee id doesn't exist");
		else
			System.out.println("employee exists");
		
		String result2=employeeService.deleteEmployeeById("ab001");
		System.out.println(result2);
		
//		employeeService.deleteAllEmployees();
		Employee emp4=new Employee();
		
		emp4.setEmpID("dg45");
		emp4.setEmpFirstName("sunil");
		emp4.setEmpLastName("Jindal");
		emp4.setEmpPan("AWUC0898TY");
		emp4.setEmpSalary(35000);
		emp4.setEmpAddress("198/19, s.d puram");
		emp4.setEmpAadhar("1233 4567 8906");
		
		employeeService.updateEmployee("ab001",emp4);
		
				
	}

}
