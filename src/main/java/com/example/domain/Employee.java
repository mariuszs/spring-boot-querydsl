package com.example.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	
	@OneToMany(mappedBy="owner", fetch=FetchType.LAZY)
	private List<Phone> phones;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
