package com.kh.sporthub.models;




import java.nio.charset.Charset;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;







@Document
@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id; 
	
	
	
	private static int count = 0;
	private int ref_ticket;
	
	private String match_tag; 
	
	private String match_name;
	
	private String stadium_name; 
	private String stadium_zone;
	
	private double price;
	private Boolean Status; 
	private Boolean checked_by_agent;
	
	@OneToMany
	private  List <Stadium> stade ;
	
	public Ticket(String match_name,  String stadium_name,
			String stadium_zone, double price  ) {
		
		super();
		
		
		setRef_ticket(ref_ticket) ;
		setMatch_tag (match_tag) ;
		
		this.match_name = match_name ;
		this.stadium_name = stadium_name;
		this.stadium_zone = stadium_zone;
		this.price = price;
		Status = true;
		checked_by_agent = false;
		
			
		
	}



	public Ticket() {
		setRef_ticket(ref_ticket) ;
		Status = true;
		checked_by_agent = false;
		this.stade = stade;
		setMatch_tag (match_tag) ;
		
	}











	public List<Stadium> getStade() {
		return stade;
	}



	public void setStade(List<Stadium> stade) {
		this.stade = stade;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public static int getCount() {
		return count;
	}



	public static void setCount(int count) {
		Ticket.count = count;
	}



	public int getRef_ticket() {
		return ref_ticket;
	}



	public void setRef_ticket(int ref_ticket) {
	
		this.ref_ticket = count++;
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
		return "Ticket [id=" + id + ", ref_ticket=" + ref_ticket + ", match_tag=" + match_tag + ", match_name="
				+ match_name + ", stadium_name=" + stadium_name + ", stadium_zone=" + stadium_zone + ", price=" + price
				+ ", Status=" + Status + ", checked_by_agent=" + checked_by_agent +  "]";
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
