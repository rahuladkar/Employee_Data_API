package com.rahul.employee_app.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rahul.employee_app.entity.Employee;
import com.rahul.employee_app.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	// to add the employee
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}
	
	// to get the employee
	public Employee getEmployeeById(int id) {
		
		Optional<Employee> optional = employeeRepository.findById(id);	
		
		if (optional.isPresent()) {
			return optional.get();
		}else {
			return null;
		}
		
	}
	
	// to update the employee
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
		
	}
	
	// to delete the employee
	public void deleteEmployeeById(int id) {
		
		employeeRepository.deleteById(id);		
		
	}
}
