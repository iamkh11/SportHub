package com.kh.sporthub.models;



import javax.persistence.Entity;

import org.springframework.data.mongodb.core.mapping.Document;



@Document
@Entity
public class Supporters extends Users {

	private String badge;
	
	
	
	public Supporters() {
		
	}



	public Supporters(String name, String username, String email, String password,String profil_pic_URL, String badge) {
		super(name, username, email, password,profil_pic_URL );
		this.badge = badge ;
	}



	public String getBadge() {
		return badge;
	}



	public void setBadge(String badge) {
		this.badge = badge;
	}



	@Override
	public String toString() {
		return "Supporters [badge=" + badge + "]";
	}
	

	
	
}