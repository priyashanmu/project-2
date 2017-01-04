package com.chat.services;

import java.util.List;

import com.chat.model.Forum;

public interface ForumServices {

	public int insertRow(Forum f); 
	 public List getList();
	 public Forum getRowById(int id);
	 public int updateRow(Forum f);
	 public int deleteRow(int id);

}
