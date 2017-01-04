package com.chat.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.ReplayDAO;

import com.chat.model.Replay;

@Service("replayServices")
@Transactional(propagation = Propagation.SUPPORTS)
public class ReplayServicesImbl implements ReplayServices {

	@Autowired
	private ReplayDAO replayDAO;

	public int insertRow(Replay r) {
		// TODO Auto-generated method stub
		return  replayDAO.insertRow(r);
		 
	}

	public List getList() {
		// TODO Auto-generated method stub
		return replayDAO.getList();
	}

	public Replay getRowById(int id) {
		// TODO Auto-generated method stub
		return  replayDAO.getRowById(id);
	}

	public int updateRow(Replay r) {
		// TODO Auto-generated method stub
		return  replayDAO.updateRow(r);
	}

	public int deleteRow(int id) {
		// TODO Auto-generated method stub
		return  replayDAO.deleteRow(id);
	}
}

