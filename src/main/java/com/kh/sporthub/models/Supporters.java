package com.kh.sporthub.models;





import org.springframework.data.mongodb.core.mapping.Document;



@Document

public class Supporters extends Users {

	private String badge;
	
	
	
	public Supporters() {
		
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