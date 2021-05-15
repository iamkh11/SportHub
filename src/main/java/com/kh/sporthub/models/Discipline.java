package com.kh.sporthub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Entity
public class Discipline {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id; 
	

	
	private String name; 
	
	
	
	
	
	
	
	
	
}
