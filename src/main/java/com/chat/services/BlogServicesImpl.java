package com.chat.services;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.BlogDAO;
import com.chat.model.Blog;



@Service("blogServices")
@Transactional(propagation = Propagation.SUPPORTS)
public class BlogServicesImpl implements BlogServices{
	
	@Autowired
	private BlogDAO blogDAO;

	public int insertRow(Blog b) {
		// TODO Auto-generated method stub
		return  blogDAO.insertRow(b);
		 
	}

	public List getList() {
		// TODO Auto-generated method stub
		return blogDAO.getList();
	}

	public Blog getRowById(int id) {
		// TODO Auto-generated method stub
		return  blogDAO.getRowById(id);
	}

	public int updateRow(Blog b) {
		// TODO Auto-generated method stub
		return  blogDAO.updateRow(b);
	}

	public int deleteRow(int id) {
		// TODO Auto-generated method stub
		return  blogDAO.deleteRow(id);
	}
}
