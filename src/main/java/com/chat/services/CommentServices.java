package com.chat.services;

import java.util.List;


import com.chat.model.BlogCmd;

public interface CommentServices {
	public int insertRow(BlogCmd c); 
	 public List getList();
	 public BlogCmd getRowById(int id);
	 public int updateRow(BlogCmd c);
	 public int deleteRow(int id);

}
