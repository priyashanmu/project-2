package com.chat.dao;

import java.util.List;

import com.chat.model.Forum;

public interface ForumDAO {
	public List getList();
	 public Forum getRowById(int id);
	 public int updateRow(Forum f); 
		
	 public int deleteRow(int id);
	 public int insertRow(Forum f);
}
