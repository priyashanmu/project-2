package com.chat.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.CommentDAO;

import com.chat.model.BlogCmd;

@Service("commentServices")
@Transactional(propagation = Propagation.SUPPORTS)
public class CommentServicesImbl implements CommentServices {

	@Autowired
	private CommentDAO commentDAO;

	public int insertRow(BlogCmd c) {
		// TODO Auto-generated method stub
		return  commentDAO.insertRow(c);
		 
	}

	public List getList() {
		// TODO Auto-generated method stub
		return commentDAO.getList();
	}

	public BlogCmd getRowById(int id) {
		// TODO Auto-generated method stub
		return  commentDAO.getRowById(id);
	}

	public int updateRow(BlogCmd c) {
		// TODO Auto-generated method stub
		return  commentDAO.updateRow(c);
	}

	public int deleteRow(int id) {
		// TODO Auto-generated method stub
		return  commentDAO.deleteRow(id);
	}
}

