package com.kh.sporthub.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document (collection = "team")
@Entity
public class Team {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private String id; 
		
		
		private String fullname;
		private String team_nickname;
		private String team_founded;
		private String team_owner;
		private String team_league;
		private String logo_URL;
		private String descipline;
	
		
		
		


	


		public Team(String fullname, String team_nickname, String team_founded, String team_owner, String team_league,
				String logo_URL, String descipline) {
			super();
			this.fullname = fullname;
			this.team_nickname = team_nickname;
			this.team_founded = team_founded;
			this.team_owner = team_owner;
			this.team_league = team_league;
			this.logo_URL = logo_URL;
			this.descipline = descipline;
		}





		public String getId() {
			return id;
		}





		public void setId(String id) {
			this.id = id;
		}





	


		public String getDescipline() {
			return descipline;
		}





		public void setDescipline(String descipline) {
			this.descipline = descipline;
		}





		public String getFullname() {
			return fullname;
		}





		public void setFullname(String fullname) {
			this.fullname = fullname;
		}





		public String getTeam_nickname() {
			return team_nickname;
		}





		public void setTeam_nickname(String team_nickname) {
			this.team_nickname = team_nickname;
		}


		public String getTeam_founded() {
			return team_founded;
		}


		public void setTeam_founded(String team_founded) {
			this.team_founded = team_founded;
		}


		public String getTeam_owner() {
			return team_owner;
		}


		public void setTeam_owner(String team_owner) {
			this.team_owner = team_owner;
		}


		public String getTeam_league() {
			return team_league;
		}


		public void setTeam_league(String team_league) {
			this.team_league = team_league;
		}


		public String getLogo_URL() {
			return logo_URL;
		}


		public void setLogo_URL(String logo_URL) {
			this.logo_URL = logo_URL;
		}





		@Override
		public String toString() {
			return "Team [id=" + id + ", fullname=" + fullname + ", team_nickname=" + team_nickname + ", team_founded="
					+ team_founded + ", team_owner=" + team_owner + ", team_league=" + team_league + ", logo_URL="
					+ logo_URL + ", descipline=" + descipline + "]";
		}





		
		
	


		



		

	
	
	
}
