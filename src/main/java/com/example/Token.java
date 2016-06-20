package com.example;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Token {

    @Id
    @GeneratedValue
    private Long id;

}
