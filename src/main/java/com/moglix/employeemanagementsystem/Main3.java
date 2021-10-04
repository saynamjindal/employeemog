package com.moglix.employeemanagementsystem;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

import com.moglix.employeemanagementsystem.dto.Employee;

public class Main3 {
	
	public static void main(String[] args) {
		TreeSet<Employee> employees = new TreeSet<>();
		
		Employee employee= new Employee("bc001","saynam","Jindal",45000.0,"gfgdfh","gfdfhgjgh","jhdgsg");
		
		Employee employee2= new Employee("bc004","jtrh","Jindal",45000.0,"gfgdfh","gfdfhgjgh","jhdgsg");
		
		Employee employee3= new Employee("bc0441","saynam","Jindal",45000.0,"gfgdfh","gfdfhgjgh","jhdgsg");
		
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		employees.remove(employee2);
		
		boolean result=employees.contains(employee3);
		
//		HashSet<Employee> employees1 = (HashSet<Employee>) employees.clone();
		
		System.out.println(result);
		
		System.out.println(employees);
		
//		System.out.println(employees1);
		
	}

}

