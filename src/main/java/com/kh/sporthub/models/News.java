package com.kh.sporthub.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document (collection = "news")
public class News {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id; 
	
	
	
	private String title;
	private String content;
	private String date;
	private String image;
	private String category;
	private String descipline;
	private Boolean status;
	
	



	


	public News(String title, String content, String date, String image, String category, String descipline,
			Boolean status) {
		super();
		this.title = title;
		this.content = content;
		this.date = date;
		this.image = image;
		this.category = category;
		this.descipline = descipline;
		status = false;
	}





	public String getCategory() {
		return category;
	}





	public void setCategory(String category) {
		this.category = category;
	}





	public Boolean getStatus() {
		return status;
	}





	public void setStatus(Boolean status) {
		this.status = status;
	}





	public News() {
		// TODO Auto-generated constructor stub
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getDescipline() {
		return descipline;
	}


	public void setDescipline(String descipline) {
		this.descipline = descipline;
	}


	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", content=" + content + ", date=" + date + ", image=" + image
				+ ", descipline=" + descipline + ", Status=" + status + "]";
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
