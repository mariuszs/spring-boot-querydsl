package com.example.servicies;

import com.example.domain.Employee;

public interface EmployeeService {
	
	Iterable<Employee> findEmployeesByPhoneNumber(String phoneNumber);

}
