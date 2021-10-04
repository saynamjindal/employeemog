package com.moglix.employeemanagementsystem;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.TreeSet;

import com.moglix.employeemanagementsystem.dto.Employee;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s="saynam";
//		String s2="Jindal";
//		String s3="oiuyt";
//		String s4="qwerty";
//		
//		TreeSet<String> employees = new TreeSet<>();
//		employees.add(s);
//		employees.add(s2);
//		employees.add(s3);
//		employees.add(s4);
//		
//		System.out.println(employees);
		
		TreeMap<String, String> hashmap = new TreeMap<>();
		
		hashmap.put("z001", "saynam");
		
		hashmap.put("ab002", "saym");
		hashmap.put("ab001", "Jindal");
		
		System.out.println(hashmap);

	}

}
