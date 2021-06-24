package com.kh.sporthub.models;




import java.util.Random;
import java.util.UUID;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;







@Document
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id; 
	
	
	
	
	private String match_tag; 
	
	private String match_name;
	
	private String stadium_name; 
	private String stadium_zone;
	
	private String date;
	private String time;
	

	private String competition;
	private String discipline;
	private String season;
	
	private double price;
	private Boolean Status; 
	private Boolean checked_by_agent;
	
	private String mail_buyer;
	
	@DBRef
	private User buyer;
	
	
	

	public Ticket() {
		
		Status = true;
		checked_by_agent = false;
		mail_buyer = null ;
		setMatch_tag (match_tag) ;
		
	}











	



	public String getMail_buyer() {
		return mail_buyer;
	}















	public void setMail_buyer(String mail_buyer) {
		this.mail_buyer = mail_buyer;
	}















	public User getBuyer() {
		return buyer;
	}















	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}















	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public String getCompetition() {
		return competition;
	}



	public void setCompetition(String competition) {
		this.competition = competition;
	}



	public String getDiscipline() {
		return discipline;
	}



	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}



	public String getSeason() {
		return season;
	}



	public void setSeason(String season) {
		this.season = season;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	


	public String getMatch_tag() {
		return match_tag;
	}



	public void setMatch_tag(String match_tag) {
		byte[] array = new byte[20]; 
	    new Random().nextBytes(array);
	    
	this.match_tag = (String) UUID.randomUUID().toString().subSequence(0, 30) ;
		
	}



	public String getMatch_name() {
		return match_name;
	}



	public void setMatch_name(String match_name) {
		
		    this.match_name = match_name ;
	}



	public String getStadium_name() {
		return stadium_name;
	}



	public void setStadium_name(String stadium_name) {
		this.stadium_name = stadium_name;
	}



	public String getStadium_zone() {
		return stadium_zone;
	}



	public void setStadium_zone(String stadium_zone) {
		this.stadium_zone = stadium_zone;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public Boolean getStatus() {
		return Status;
	}



	public void setStatus(Boolean status) {
		Status = status;
	}



	public Boolean getChecked_by_agent() {
		return checked_by_agent;
	}



	public void setChecked_by_agent(Boolean checked_by_agent) {
		this.checked_by_agent = checked_by_agent;
	}



	@Override
	public String toString() {
		return "Ticket [id=" + id + ", match_tag=" + match_tag + ", match_name=" + match_name + ", stadium_name="
				+ stadium_name + ", stadium_zone=" + stadium_zone + ", date=" + date + ", time=" + time
				+ ", competition=" + competition + ", discipline=" + discipline + ", season=" + season + ", price="
				+ price + ", Status=" + Status + ", checked_by_agent=" + checked_by_agent + "]";
	}






	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
