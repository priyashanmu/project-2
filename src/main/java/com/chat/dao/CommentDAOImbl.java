package com.chat.dao;

import java.io.Serializable;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.chat.model.BlogCmd;

@Repository("commentDAO")
public class CommentDAOImbl implements CommentDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int insertRow(BlogCmd c) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();	 
	  session.saveOrUpdate(c);
	  tx.commit();
	  Serializable id = session.getIdentifier(c);
	  session.close();
	  return (Integer) id;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public List getList() {
	  Session session = sessionFactory.openSession();
	  @SuppressWarnings("unchecked")
	  List pList = session.createQuery("from BlogCmd").list();
	  session.close();
	  return pList;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public BlogCmd getRowById(int id) {
	  Session session = sessionFactory.openSession();
	 BlogCmd c = (BlogCmd) session.load(BlogCmd.class, id);
	  return c;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int updateRow(BlogCmd c) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  session.saveOrUpdate(c);
	  tx.commit();
	  Serializable id = session.getIdentifier(c);
	  session.close();
	  return (Integer) id;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int deleteRow(int id) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	 BlogCmd c = (BlogCmd) session.load(BlogCmd.class, id);
	  session.delete(c);
	  tx.commit();
	  Serializable ids = session.getIdentifier(c);
	  session.close();
	  return (Integer) ids;
	 }

}


