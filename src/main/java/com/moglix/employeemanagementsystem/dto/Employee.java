package com.moglix.employeemanagementsystem.dto;



public class Employee implements Comparable<Employee>{
	
	private String empID;
	private String empFirstName;
	private String empLastName;
	private double empSalary;
	private String empAddress;
	private String empPan;
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empSalary=" + empSalary + ", empAddress=" + empAddress + ", empPan=" + empPan + ", empAadhar="
				+ empAadhar + "]";
	}


	private String empAadhar;
	
	
	public Employee(String empID, String empFirstName, String empLastName, double empSalary, String empAddress,
			String empPan, String empAadhar) {
		super();
		this.empID = empID;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.empPan = empPan;
		this.empAadhar = empAadhar;
	}


	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("inside the employee constructor");
	}
	
	
	public String getEmpPan() {
		return empPan;
	}
	public void setEmpPan(String empPan) {
		this.empPan = empPan;
	}
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	
	public String getEmpAadhar() {
		return empAadhar;
	}


	public void setEmpAadhar(String empAadhar) {
		this.empAadhar = empAadhar;
	}
	
	public double calSalary() {
		double gsalary=getEmpSalary();
		double ta=(10*gsalary)/100;
		double da=(10*gsalary)/100;
		double hra=(10*gsalary)/100;
		double netsalary=hra+da+ta+gsalary;
		return netsalary;
		
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empID.compareTo(o.empID);
	}
}
