package com.sam.springbootorm.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.springbootorm.entity.Employee;
import com.sam.springbootorm.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRepo;
	
	//read by Id
	public Employee getEmployeeById(int id) {
		
		Optional<Employee> employee = empRepo.findById(id);
		
		if(employee.isPresent()) {
			return employee.get();
		}
		return null;
	}
	
	public List<Employee> getAllEmployees(){
		
		List<Employee> employees = new ArrayList<Employee>();
		
		empRepo.findAll().forEach(employee->employees.add(employee));
		
		return employees;
	}
	
	//create
	
	//update
	public void saveorUpdate(Employee employee) {
		
		empRepo.save(employee);
	}
	
	//delete
	public void deleteEmployeeById(int id ) {
		
		empRepo.deleteById(id);
	}
	
}
