package com.kh.sporthub.models;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;



@Document
@MappedSuperclass
public abstract class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id; 
	private String fullname;
	private String username;
	private String email;
	private String password;
	private String profil_pic_URL;
	
	


public Users () {
	
	
}




public String getId() {
	return id;
}




public void setId(String id) {
	this.id = id;
}




public String getFullname() {
	return fullname;
}




public void setFullname(String fullname) {
	this.fullname = fullname;
}




public String getUsername() {
	return username;
}




public void setUsername(String username) {
	this.username = username;
}




public String getEmail() {
	return email;
}




public void setEmail(String email) {
	this.email = email;
}




public String getPassword() {
	return password;
}




public void setPassword(String password) {
	this.password = password;
}




public String getProfil_pic_URL() {
	return profil_pic_URL;
}




public void setProfil_pic_URL(String profil_pic_URL) {
	this.profil_pic_URL = profil_pic_URL;
}




@Override
public String toString() {
	return "Users [id=" + id + ", fullname=" + fullname + ", username=" + username + ", email=" + email + ", password="
			+ password + ", profil_pic_URL=" + profil_pic_URL + "]";
}










}