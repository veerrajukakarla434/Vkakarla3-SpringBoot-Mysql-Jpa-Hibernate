package com.vkakarla.springboot.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vkakarla.springboot.jpa.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
