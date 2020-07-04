package com.vkakarla.springboot.jpa.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkakarla.springboot.jpa.entities.Employee;
import com.vkakarla.springboot.jpa.repo.EmployeeRepository;
import com.vkakarla.springboot.jpa.service.IEmployeeService;


@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {

		employeeRepository.save(employee);

	}

}
