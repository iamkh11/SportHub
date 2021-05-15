package com.kh.sporthub.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Entity
public class Stadium {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id; 
	
	
	private String stadium_fullname;
	private String stadium_placement;
	private Integer stadium_capacity;
	
	private String team_fullname;
	
	private String image_URL;
	
	
	

	public Stadium(String stadium_fullname, String stadium_placement, Integer stadium_capacity, String team_fullname,
			String image_URL) {
		super();
		this.stadium_fullname = stadium_fullname;
		this.stadium_placement = stadium_placement;
		this.stadium_capacity = stadium_capacity;
		this.team_fullname = team_fullname;
		this.image_URL = image_URL;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getStadium_fullname() {
		return stadium_fullname;
	}




	public void setStadium_fullname(String stadium_fullname) {
		this.stadium_fullname = stadium_fullname;
	}




	public String getStadium_placement() {
		return stadium_placement;
	}




	public void setStadium_placement(String stadium_placement) {
		this.stadium_placement = stadium_placement;
	}




	


	public Integer getStadium_capacity() {
		return stadium_capacity;
	}




	public void setStadium_capacity(Integer stadium_capacity) {
		this.stadium_capacity = stadium_capacity;
	}




	public String getTeam_fullname() {
		return team_fullname;
	}




	public void setTeam_fullname(String team_fullname) {
		this.team_fullname = team_fullname;
	}




	public String getImage_URL() {
		return image_URL;
	}




	public void setImage_URL(String image_URL) {
		this.image_URL = image_URL;
	}




	@Override
	public String toString() {
		return "Stadium [id=" + id + ", stadium_fullname=" + stadium_fullname + ", stadium_placement="
				+ stadium_placement + ", stadium_capacity=" + stadium_capacity + ", team_fullname=" + team_fullname
				+ ", image_URL=" + image_URL + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
