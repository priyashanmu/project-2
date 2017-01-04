package com.chat.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Blog {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int bid;
@NotEmpty(message="Field is mandatory")

private String tag;
@NotEmpty(message="Field is mandatory")

private String content;
@NotEmpty(message="Field is mandatory")

private String title;
@NotEmpty(message="Field is mandatory")

private String author;
private Date cretion;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getTag() {
	return tag;
}
public void setTag(String tag) {
	this.tag = tag;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}

	public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public Date getCretion() {
	return cretion;
}
public void setCretion(Date cretion) {
	this.cretion = cretion;
}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}

}
