package com.kh.sporthub.models;



import javax.persistence.Entity;

import org.springframework.data.mongodb.core.mapping.Document;



@Document
@Entity
public class Admins extends Users {
		
	private String role;
	
	
	
	public Admins() {
		
	}



	public Admins(String name, String username, String email, String password ,String profil_pic_URL, String role) {
		super(name, username, email, password, profil_pic_URL);
		
		
		this.role = role ;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "Admins [role=" + role + "]";
	}
	

	
	
}