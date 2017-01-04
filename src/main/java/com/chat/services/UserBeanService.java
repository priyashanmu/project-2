package com.chat.services;

import java.util.List;

import com.chat.model.UserAccount;




public interface UserBeanService {
	public int insertRow(UserAccount ub); 
	 public List getList();
	 public UserAccount getRowById(int id);
	 public int updateRow(UserAccount ub);
	 public int deleteRow(int id);
}
