package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

import com.example.domain.Employee;
import com.example.domain.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long>, QueryDslPredicateExecutor<Phone> {
	
	List<Phone> findByOwner(Employee owner);

}
