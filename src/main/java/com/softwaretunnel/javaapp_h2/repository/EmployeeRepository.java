package com.softwaretunnel.javaapp_h2.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.softwaretunnel.javaapp_h2.persistance.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	
	Employee save(Employee employee);

	List<Employee> findAll();
	
	void delete(Employee employee);

}
