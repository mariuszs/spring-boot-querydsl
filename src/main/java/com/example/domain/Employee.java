package com.example.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	@OneToMany(mappedBy="owner")
	private List<Phone> phones;

}
