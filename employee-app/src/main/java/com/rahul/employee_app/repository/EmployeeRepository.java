package com.rahul.employee_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahul.employee_app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
   