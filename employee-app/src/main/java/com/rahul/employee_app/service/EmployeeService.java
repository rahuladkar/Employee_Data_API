package com.rahul.employee_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rahul.employee_app.dao.EmployeeDao;
import com.rahul.employee_app.dto.ResponseStructure;
import com.rahul.employee_app.entity.Employee;
import com.rahul.employee_app.exception.IdDoesNotFoundException;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	public ResponseEntity<ResponseStructure<Employee>> saveEmployee(Employee employee) {

		Employee recieveEmployee = employeeDao.saveEmployee(employee);

		ResponseStructure<Employee> responseStructure = new ResponseStructure<Employee>();

		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMesage("Success...!");
		responseStructure.setData(recieveEmployee);

		return new ResponseEntity<ResponseStructure<Employee>>(responseStructure, HttpStatus.CREATED);

	}

	public ResponseEntity<ResponseStructure<Employee>> getEmployeeById(int id){
		
		Employee employee = employeeDao.getEmployeeById(id);
		
		if (employee!=null) {

			ResponseStructure<Employee> responseStructure = new ResponseStructure<Employee>();
			
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setMesage("Success...!");
			responseStructure.setData(employee);
			
			return new ResponseEntity<ResponseStructure<Employee>>(responseStructure,HttpStatus.OK);
			
		}else {
			throw new IdDoesNotFoundException("Id " + id + " , Not Present...!");
		}
		
	}

}
