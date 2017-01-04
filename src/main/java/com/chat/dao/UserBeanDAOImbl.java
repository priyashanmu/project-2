package com.chat.dao;

import java.io.Serializable;



import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.model.UserAccount;
import com.chat.model.UserRole;


@Repository("userBeanDAO")
public class UserBeanDAOImbl implements UserBeanDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int insertRow(UserAccount ub) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  ub.setEnable(true);
		UserRole r=new UserRole();
		r.setRoleid(ub.getUserid());
		r.setRole_name("ROLE_USER");
		r.setRole_username(ub.getUserName());
		session.saveOrUpdate(r);
	

	  session.saveOrUpdate(ub);
	  tx.commit();
	  Serializable id = session.getIdentifier(ub);
	  session.close();
	  return (Integer) id;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public List getList() {
	  Session session = sessionFactory.openSession();
	  @SuppressWarnings("unchecked")
	  List pList = session.createQuery("from UserAccount").list();
	  session.close();
	  return pList;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public UserAccount getRowById(int id) {
	  Session session = sessionFactory.openSession();
	  UserAccount ub = (UserAccount) session.load(UserAccount.class, id);
	  return ub;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int updateRow(UserAccount ub) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  session.saveOrUpdate(ub);
	  tx.commit();
	  Serializable id = session.getIdentifier(ub);
	  session.close();
	  return (Integer) id;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int deleteRow(int id) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  UserAccount ub = (UserAccount) session.load(UserAccount.class, id);
	  session.delete(ub);
	  tx.commit();
	  Serializable ids = session.getIdentifier(ub);
	  session.close();
	  return (Integer) ids;
	 }

}