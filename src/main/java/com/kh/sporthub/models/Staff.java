package com.kh.sporthub.models;




import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document

public class Staff  {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private String id; 
		
		private String staff_fullname; 
		private Integer staff_age; 
		private String staff_birth_date;
		private String staff_nationality;
		private String staff_gender;
		
		private String team_fullname;
		
		private String staff_role;
		private String staff_pic_URL;
		
		private String descipline;
		
		


		public Staff(String staff_fullname, Integer staff_age, String staff_birth_date, String staff_nationality,
				String staff_gender, String team_fullname, String staff_role, String staff_pic_URL, String descipline) {
			super();
			this.staff_fullname = staff_fullname;
			this.staff_age = staff_age;
			this.staff_birth_date = staff_birth_date;
			this.staff_nationality = staff_nationality;
			this.staff_gender = staff_gender;
			this.team_fullname = team_fullname;
			this.staff_role = staff_role;
			this.staff_pic_URL = staff_pic_URL;
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



		public String getStaff_fullname() {
			return staff_fullname;
		}


		public void setStaff_fullname(String staff_fullname) {
			this.staff_fullname = staff_fullname;
		}


		public Integer getStaff_age() {
			return staff_age;
		}


		public void setStaff_age(Integer staff_age) {
			this.staff_age = staff_age;
		}


		public String getStaff_birth_date() {
			return staff_birth_date;
		}


		public void setStaff_birth_date(String staff_birth_date) {
			this.staff_birth_date = staff_birth_date;
		}


		public String getStaff_nationality() {
			return staff_nationality;
		}


		public void setStaff_nationality(String staff_nationality) {
			this.staff_nationality = staff_nationality;
		}


		public String getStaff_gender() {
			return staff_gender;
		}


		public void setStaff_gender(String staff_gender) {
			this.staff_gender = staff_gender;
		}


		public String getTeam_fullname() {
			return team_fullname;
		}


		public void setTeam_fullname(String team_fullname) {
			this.team_fullname = team_fullname;
		}


		public String getStaff_role() {
			return staff_role;
		}


		public void setStaff_role(String staff_role) {
			this.staff_role = staff_role;
		}


		public String getStaff_pic_URL() {
			return staff_pic_URL;
		}


		public void setStaff_pic_URL(String staff_pic_URL) {
			this.staff_pic_URL = staff_pic_URL;
		}






		@Override
		public String toString() {
			return "Staff [id=" + id + ", staff_fullname=" + staff_fullname + ", staff_age=" + staff_age
					+ ", staff_birth_date=" + staff_birth_date + ", staff_nationality=" + staff_nationality
					+ ", staff_gender=" + staff_gender + ", team_fullname=" + team_fullname + ", staff_role="
					+ staff_role + ", staff_pic_URL=" + staff_pic_URL + ", descipline=" + descipline + "]";
		}









	

		
	
		
		

		

	
		
		
	
		
		
		
		
		
	
}
