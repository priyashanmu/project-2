package com.chat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.ForumDAO;
import com.chat.model.Forum;

@Service("forumServices")
@Transactional(propagation = Propagation.SUPPORTS)
public class ForumServicesImpl implements ForumServices{
	
	@Autowired
	private ForumDAO forumDAO;

	public int insertRow(Forum f) {
		// TODO Auto-generated method stub
		return  forumDAO.insertRow(f);
		 
	}

	public List getList() {
		// TODO Auto-generated method stub
		return forumDAO.getList();
	}

	public Forum getRowById(int id) {
		// TODO Auto-generated method stub
		return  forumDAO.getRowById(id);
	}

	public int updateRow(Forum f) {
		// TODO Auto-generated method stub
		return  forumDAO.updateRow(f);
	}

	public int deleteRow(int id) {
		// TODO Auto-generated method stub
		return  forumDAO.deleteRow(id);
	}
}
