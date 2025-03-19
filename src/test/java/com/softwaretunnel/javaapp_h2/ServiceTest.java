package com.softwaretunnel.javaapp_h2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.softwaretunnel.javaapp_h2.persistance.entity.Employee;
import com.softwaretunnel.javaapp_h2.service.EmployeeService;

@SpringBootTest
public class ServiceTest {

	@Autowired
	EmployeeService employeeService;

	@Test
	void contextLoads() throws Exception {
		assertThat(employeeService).isNotNull();
	}

	@Test
	public void testInsertEmployeeRecords() throws Exception {

		String firstName = "Tom";
		String lastName = "Greg";
		Employee employee = new Employee();
		employee.setFirstName(firstName);
		employee.setLastName(lastName);

		try {
			employeeService.insertEmployeeRecords(employee);
			List<Employee> employees = employeeService.getEmployeeRecords();
			assertTrue(employees.size() == 1);
			Employee employeeInserted = employees.get(0);
			assertTrue(employeeInserted.getFirstName().equals(employee.getFirstName()));
			assertTrue(employeeInserted.getLastName().equals(employee.getLastName()));
			assertTrue(employeeInserted.getId() != null && employeeInserted.getId() != 0);
			
			// flush
			employeeService.deleteEmployeeRecords(employeeInserted);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}

	}

//	public void updateEmployeeRecords(Employee employee) throws Exception {
//
//		try {
//			employeeRepository.save(employee);
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw e;
//		}
//
//	}
//
//	public void deleteEmployeeRecords(Employee... employees) throws Exception {
//
//		try {
//			employeeRepository.delete(employees[0]);
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw e;
//		}
//
//	}
//
//	public List<Employee> getEmployeeRecords() throws Exception {
//
//		try {
//			List<Employee> employeeList = employeeRepository.findAll();
//			return employeeList;
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw e;
//		}
//	}

}
