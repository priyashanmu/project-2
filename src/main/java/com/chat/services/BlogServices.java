package com.chat.services;

import java.util.List;


import com.chat.model.Blog;



public interface BlogServices {
	public int insertRow(Blog b); 
	 public List getList();
	 public Blog getRowById(int id);
	 public int updateRow(Blog b);
	 public int deleteRow(int id);

}
