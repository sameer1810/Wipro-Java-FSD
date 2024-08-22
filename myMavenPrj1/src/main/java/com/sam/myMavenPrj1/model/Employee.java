package com.sam.myMavenPrj1.model;

import java.util.List;

public class Employee {
     private int id;
     private String name;
     private Address address;
     private List<Skill> skills;
     
     
	public Employee() {
	    	 
	     }
     
	public Employee(int id, String name, Address address, List<Skill> skills) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.skills = skills;
	}
	
     public Employee(int id, String name) {
    	 this.id = id;
    	 this.name = name;
     }
     
     public Employee(int id, String name, Address address) {
    	 this.id = id;
    	 this.name = name;
    	 this.address = address;
     }

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Skill> getSkills() {
		return skills;
	}
	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", skills=" + skills + "]";
	}
	
 }
 
