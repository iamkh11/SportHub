package com.kh.sporthub.models;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;






@Document (collection = "match")
public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id; 
	
	
	
	private String home_team;
	private String away_team;
	
	private String home_team_logo;
	private String away_team_logo;
	
	private String date;
	private String time;
	
	private String stadium;
	private String competition;
	
	private String discipline;
	private String season;
	private String status;
	
	
	
	@DBRef
	private  List <Ticket> tickets ;


	
	

	


	public Match(String home_team, String away_team, String home_team_logo, String away_team_logo,
			String date, String time, String stadium, String competition, String discipline, String season,
			String status, List<Ticket> tickets) {
		super();
	
		this.home_team = home_team;
		this.away_team = away_team;
		this.home_team_logo = home_team_logo;
		this.away_team_logo = away_team_logo;
		this.date = date;
		this.time = time;
		this.stadium = stadium;
		this.competition = competition;
		this.discipline = discipline;
		this.season = season;
		this.status = status;
		this.tickets = tickets;
	}



	public Match() {
		// TODO Auto-generated constructor stub
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getHome_team() {
		return home_team;
	}



	public void setHome_team(String home_team) {
		this.home_team = home_team;
	}



	public String getAway_team() {
		return away_team;
	}



	public void setAway_team(String away_team) {
		this.away_team = away_team;
	}



	public String getHome_team_logo() {
		return home_team_logo;
	}



	public void setHome_team_logo(String home_team_logo) {
		this.home_team_logo = home_team_logo;
	}



	public String getAway_team_logo() {
		return away_team_logo;
	}



	public void setAway_team_logo(String away_team_logo) {
		this.away_team_logo = away_team_logo;
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



	public String getStadium() {
		return stadium;
	}



	public void setStadium(String stadium) {
		this.stadium = stadium;
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



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public List<Ticket> getTickets() {
		return tickets;
	}



	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}



	@Override
	public String toString() {
		return "Match [id=" + id + ", home_team=" + home_team + ", away_team=" + away_team + ", home_team_logo="
				+ home_team_logo + ", away_team_logo=" + away_team_logo + ", date=" + date + ", time=" + time
				+ ", stadium=" + stadium + ", competition=" + competition + ", discipline=" + discipline + ", season="
				+ season + ", status=" + status + ", tickets=" + tickets + "]";
	}



	

	
	
	
	
}