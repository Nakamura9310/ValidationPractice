package com.example.demo.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class User {
	
	private int id;
	
	@NotBlank
	private String name;
	
	private int age;
}
