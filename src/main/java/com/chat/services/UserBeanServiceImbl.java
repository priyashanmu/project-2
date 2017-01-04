package com.chat.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.dao.UserBeanDAO;
import com.chat.model.UserAccount;



@Service("userBeanService")
@Transactional(propagation = Propagation.SUPPORTS)
public class UserBeanServiceImbl implements UserBeanService{
	
	@Autowired
	 UserBeanDAO userBeanDAO;

	public int insertRow(UserAccount ub) {
		// TODO Auto-generated method stub
		return  userBeanDAO.insertRow(ub);
		 
	}

	public List getList() {
		// TODO Auto-generated method stub
		return userBeanDAO.getList();
	}

	public UserAccount getRowById(int id) {
		// TODO Auto-generated method stub
		return  userBeanDAO.getRowById(id);
	}

	public int updateRow(UserAccount ub) {
		// TODO Auto-generated method stub
		return  userBeanDAO.updateRow(ub);
	}

	public int deleteRow(int id) {
		// TODO Auto-generated method stub
		return  userBeanDAO.deleteRow(id);
	}
}
