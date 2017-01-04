package com.chat.dao;

import java.util.List;

import com.chat.model.Replay;

public interface ReplayDAO {

	public List getList();
	 public Replay getRowById(int id);
	 public int updateRow(Replay r); 
		
	 public int deleteRow(int id);
	 public int insertRow(Replay r);
}
