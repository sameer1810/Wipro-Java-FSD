package com.sam.springbootorm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sam.springbootorm.entity.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer>{

}
