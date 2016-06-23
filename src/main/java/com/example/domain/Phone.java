package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Phone {

	@Id
	@GeneratedValue
	private Long id;

	private String number;
	
	public Phone(){//for JPA
	}
	public Phone(String number){
		this.number = number;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	//@JoinColumn(name="OWNER_ID")
	private Employee owner;
}
