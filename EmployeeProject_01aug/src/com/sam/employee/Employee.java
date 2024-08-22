package com.sam.employee;

public class Employee {
	   
	   public int id;
	   public String firstname;
	   public String lastname;
	   public String designation;
	   public double mobile_number ;
	   public int salary;

	  
	   public Employee(int empId, String firstname, String lastname, String designation, double mobile_number, int salary) {
		   this.id = empId;
		   this.firstname = firstname;
		   this.lastname = lastname;
		   this.designation = designation;
		   this.mobile_number = mobile_number;
		   this.salary = salary;
	    }

	public Employee(String name, String designation) {
		// TODO Auto-generated constructor stub
	}

	public int getempId() {
		return getempId();
	}

	public String getDesignation() {
		return designation;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", designation="
				+ designation + ", mobile_number=" + mobile_number + ", salary=" + salary + "]";
	}
	

	public String getName() {
		return firstname + " " + lastname ;
	}
}

	 	   