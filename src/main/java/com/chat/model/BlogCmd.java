package com.chat.model;

import java.util.Date;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class BlogCmd {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cmdId;
	private int blogid;
	@NotEmpty(message="Field is mandatory")
	
	private String uname;
	private String url;
	@NotEmpty(message="Field is mandatory")
	
	private String cmdContent;
	
	private Date creationDate;
	
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getCmdContent() {
		return cmdContent;
	}
	public void setCmdContent(String cmdContent) {
		this.cmdContent = cmdContent;
	}
	public int getBlogid() {
		return blogid;
	}
	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}
	public int getCmdId() {
		return cmdId;
	}
	public void setCmdId(int cmdId) {
		this.cmdId = cmdId;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

}
