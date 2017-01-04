package com.chat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class UserAccount {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userid;

private boolean enable;

	

	public boolean isEnable() {
	return enable;
}

public void setEnable(boolean enable) {
	this.enable = enable;
}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

private String userName;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	@NotEmpty(message="Field is mandatory")
	
	private String email;
	
	
	private String password;
	
	@Transient
	private String conform_password;

	

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

	public String getConform_password() {
		return conform_password;
	}

	public void setConform_password(String conform_password) {
		this.conform_password = conform_password;
	}
	

}
