package com.chat.dao;

import java.util.List;


import com.chat.model.BlogCmd;

public interface CommentDAO {
	public List getList();
	 public BlogCmd getRowById(int id);
	 public int updateRow(BlogCmd c); 
		
	 public int deleteRow(int id);
	 public int insertRow(BlogCmd c);
}
