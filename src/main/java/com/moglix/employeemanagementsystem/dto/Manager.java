package com.moglix.employeemanagementsystem.dto;

public class Manager extends Employee{
	
	private String projectName;
	private float projectAllowance;
	public String getProjectName() {
		return projectName;
	}
	@Override
	public  double calSalary() {
		// TODO Auto-generated method stub
		return super.calSalary()+this.projectAllowance;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public float getProjectAllowance() {
		return projectAllowance;
	}
	public Manager(String empID, String empFirstName, String empLastName, double empSalary, String empAddress,
			String empPan, String empAadhar, String projectName, float projectAllowance) {
		super(empID, empFirstName, empLastName, empSalary, empAddress, empPan, empAadhar);
		this.projectName=projectName;
		this.projectAllowance=projectAllowance;
				
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"Manager [projectName=" + projectName + ", projectAllowance=" + projectAllowance + "]";
	}
	public void setProjectAllowance(float projectAllowance) {
		this.projectAllowance = projectAllowance;
	}
	public Manager() {
		// TODO Auto-generated constructor stub
		super("ab001","saynam","jindal",12300.0,"dfjfgd","hdsefj","rddu");// used to give a call to base class constructor
		//super method must be a 1st call
		//super method will not return anything
		System.out.println("hello from Manager constructor");
	}
	
	

}
