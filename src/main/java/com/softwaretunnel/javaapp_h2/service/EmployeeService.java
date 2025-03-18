package com.softwaretunnel.javaapp_h2.service;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.softwaretunnel.javaapp_h2.persistance.entity.Employee;
import com.softwaretunnel.javaapp_h2.repository.EmployeeRepository;

@Service
public class EmployeeService  {

	@Autowired
	EmployeeRepository employeeRepository;

	public void insertEmployeeRecords(Employee employee) throws Exception {

		try {
			employeeRepository.save(employee);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public void updateEmployeeRecords(Employee employee) throws Exception {

		try {
			employeeRepository.save(employee);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public void deleteEmployeeRecords(Employee... employees) throws Exception {

		try {
			employeeRepository.delete(employees[0]);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

	public List<Employee> getEmployeeRecords() throws Exception {

		try {
			List<Employee> employeeList = employeeRepository.findAll();
			return employeeList;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

}
