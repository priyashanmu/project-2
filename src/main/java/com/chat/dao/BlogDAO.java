package com.chat.dao;

import java.util.List;


import com.chat.model.Blog;


public interface BlogDAO {
	 public List getList();
	 public Blog getRowById(int id);
	 public int updateRow(Blog b); 
		
	 public int deleteRow(int id);
	 public int insertRow(Blog b);

}
