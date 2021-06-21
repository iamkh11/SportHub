package com.kh.sporthub.models;




import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;




import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;






@Document(collection = "players")
public class Players {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id; 
	
	
	
	private String player_fullname; 
	private Integer player_age; 
	private String player_birth_date;
	private String player_nationality;
	private String player_gender;
	private Integer player_number;
	private String player_position;
	
	
	private String team_name;
	
	private String player_pic_URL;

	private String player_descipline;
	

	

	public Players(String player_fullname, Integer player_age, String player_birth_date, String player_nationality,
			String player_gender, Integer player_number, String player_position, String team_name,
			String player_pic_URL, String player_descipline) {
		
		this.player_fullname = player_fullname;
		this.player_age = player_age;
		this.player_birth_date = player_birth_date;
		this.player_nationality = player_nationality;
		this.player_gender = player_gender;
		this.player_number = player_number;
		this.player_position = player_position;
		this.team_name = team_name;
		this.player_pic_URL = player_pic_URL;
		this.player_descipline = player_descipline;
	}







	






	public Players() {
		// TODO Auto-generated constructor stub
	}





	public String getPlayer_descipline() {
		return player_descipline;
	}







	public void setPlayer_descipline(String player_descipline) {
		this.player_descipline = player_descipline;
	}









	public String getId() {
		return id;
	}







	public void setId(String id) {
		this.id = id;
	}







	public String getPlayer_fullname() {
		return player_fullname;
	}







	public void setPlayer_fullname(String player_fullname) {
		this.player_fullname = player_fullname;
	}







	public Integer getPlayer_age() {
		return player_age;
	}







	public void setPlayer_age(Integer player_age) {
		this.player_age = player_age;
	}







	public String getPlayer_birth_date() {
		return player_birth_date;
	}







	public void setPlayer_birth_date(String player_birth_date) {
		this.player_birth_date = player_birth_date;
	}







	public String getPlayer_nationality() {
		return player_nationality;
	}







	public void setPlayer_nationality(String player_nationality) {
		this.player_nationality = player_nationality;
	}







	public String getPlayer_gender() {
		return player_gender;
	}







	public void setPlayer_gender(String player_gender) {
		this.player_gender = player_gender;
	}







	public Integer getPlayer_number() {
		return player_number;
	}







	public void setPlayer_number(Integer player_number) {
		this.player_number = player_number;
	}







	public String getPlayer_position() {
		return player_position;
	}







	public void setPlayer_position(String player_position) {
		this.player_position = player_position;
	}







	public String getTeam_name() {
		return team_name;
	}







	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}







	public String getPlayer_pic_URL() {
		return player_pic_URL;
	}







	public void setPlayer_pic_URL(String player_pic_URL) {
		this.player_pic_URL = player_pic_URL;
	}
	
	







	@Override
	public String toString() {
		return "Players [player_fullname=" + player_fullname + ", player_age=" + player_age + ", player_birth_date="
				+ player_birth_date + ", player_nationality=" + player_nationality + ", player_gender=" + player_gender
				+ ", player_number=" + player_number + ", player_position=" + player_position + ", team_name="
				+ team_name + ", player_pic_URL=" + player_pic_URL + ", player_descipline=" + player_descipline + "]";
	}














	

	
	
	
	
	
	
	
	
}
