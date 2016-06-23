package com.example.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Employee;
import com.example.repositories.EmployeeRepository;

import static com.example.domain.QEmployee.employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository repository;

	@Override
	public Iterable<Employee> findEmployeesByPhoneNumber(String phoneNumber) {
		return repository.findAll(employee.phones.any().number.contains(phoneNumber));
	}

}
