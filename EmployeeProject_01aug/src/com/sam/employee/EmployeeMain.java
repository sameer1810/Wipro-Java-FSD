package com.sam.employee;

import java.util.Scanner;
import java.util.ArrayList;

public class EmployeeMain {

	private static ArrayList<Employee> employees = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = 0;

        while (true) {
			System.out.println("\nMenu");
			System.out.println("1. Add an employee");
			System.out.println("2. List All Employees");
			System.out.println("3. List Employees who are managers");
			System.out.println("4. Delete an Employee");
			System.out.println("5. Exist");
			System.out.println("Enter your choice");
		     
			if(scanner.hasNextInt()) {
				choice = scanner.nextInt();
				scanner.nextLine();
			}
             switch(choice) {
			    case 1:
					addEmployee(scanner);
				      break;
			    case 2:
			    	listAllemployees();
			    	break;
			    case 3:
			    	listManagers();
			    	break;
			    case 4:
			         deleteEmployee(scanner);
			    	break;
			    case 5:
			    	System.out.println("Exist the program.");
			    	return;
			    default:
			    	System.out.println("Invalid choice!Please try again.");
				 }
			 }
	}
	
		 private static void addEmployee(Scanner scanner) {
				System.out.println("Enter employee name:");
				String name = scanner.nextLine();
				System.out.println("Enter employeee designation:");
				String designation = scanner.nextLine();
				employees.add(new Employee(name, designation));
					System.out.println("Employee added successfully.");
			 }
				
			
		  public static void listAllEmployees() {
		  	if(employees.isEmpty()) {
		  		System.out.println("No employee Found.");
		  	}
		  	else {
		  		System.out.println("List of all Employees");
		  		for(Employee employee : employees) {
		  			System.out.println(employee);
		  		}
		  	}
		  }
		  
			private static void listManagers() {
				boolean managerFound = false;
				System.out.println("List of managers:");
			    for(Employee emp : employees) {
			    	if(emp.designation.equalsIgnoreCase("Manager")) {
			    		System.out.println(emp);
			    		managerFound = true;
			    	}
			    }
			    if(!managerFound) {
			    	System.out.println("No managers found.");
			    }
			}

			private static void listAllemployees() {
				if(employees.isEmpty()) {
					System.out.println("No employees found.");
				}else {
					for(Employee emp : employees) {
						System.out.println(employees);
				   }
				}
			}
		
			
			public static void deleteEmployee(Scanner scanner) {
				System.out.println("Enter the name of the employee to delete:");
				String name = scanner.nextLine();
				boolean removed = employees.removeIf(employee -> employee.getName().equalsIgnoreCase(name));
	
			if(removed) {
				  System.out.println("Employee deleted successfully");
			  } else {
				  System.out.println("No Employee found");
			  }
         }
}

