package com.example.demomicroservice.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demomicroservice.bean.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	

}
