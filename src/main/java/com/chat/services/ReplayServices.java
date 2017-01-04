package com.chat.services;

import java.util.List;


import com.chat.model.Replay;

public interface ReplayServices {
	public int insertRow(Replay rg); 
	 public List getList();
	 public Replay getRowById(int id);
	 public int updateRow(Replay r);
	 public int deleteRow(int id);

}
