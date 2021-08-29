package com.greatlearning.com.Employee;


public class Employee {
	
	private String FirstName;
	private String LastName;
	private String department;

	
	public Employee(String FristName , String LastName , String department) {
		
		this.setFirstName(FristName);
		this.setLastName(LastName);
		this.setDepartment(department);

		
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}
}
