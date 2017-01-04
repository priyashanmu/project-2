package com.chat.dao;

import java.util.List;

import com.chat.model.UserAccount;




public interface UserBeanDAO {

		 public List getList();
		 public UserAccount getRowById(int id);
		 public int updateRow(UserAccount ub);
		 public int deleteRow(int id);
		 public int insertRow(UserAccount ub);
	}


