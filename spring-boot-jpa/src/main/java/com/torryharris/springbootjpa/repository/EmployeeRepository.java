package com.torryharris.springbootjpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.torryharris.springbootjpa.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
