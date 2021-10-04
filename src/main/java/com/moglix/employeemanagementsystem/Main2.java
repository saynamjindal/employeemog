package com.moglix.employeemanagementsystem;

import com.moglix.employeemanagementsystem.dto.Employee;
import com.moglix.employeemanagementsystem.dto.Manager;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager manager =new Manager();
		
		Employee manager2 =new Manager("aboo1", "saynam", "jindal", 1230000.0, "zfsdgfgg", "zdxgff", "dfgh", "esrdtfy", 12345.0f);
		
		
		System.out.println(manager2);
		
		double salary=manager2.calSalary();
		System.out.println(salary);
	}

}
