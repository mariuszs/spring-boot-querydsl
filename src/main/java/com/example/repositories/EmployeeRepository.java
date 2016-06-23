package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.example.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>, QueryDslPredicateExecutor<Employee> {

}
