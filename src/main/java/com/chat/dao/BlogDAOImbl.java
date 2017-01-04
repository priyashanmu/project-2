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

import com.chat.model.Blog;



@Repository("BlogDAO")
public class BlogDAOImbl implements BlogDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int insertRow(Blog b) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	 
	  session.saveOrUpdate(b);
	  tx.commit();
	  Serializable id = session.getIdentifier(b);
	  session.close();
	  return (Integer) id;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public List getList() {
	  Session session = sessionFactory.openSession();
	  @SuppressWarnings("unchecked")
	  List pList = session.createQuery("from Blog").list();
	  session.close();
	  return pList;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public Blog getRowById(int id) {
	  Session session = sessionFactory.openSession();
	  Blog b = (Blog) session.load(Blog.class, id);
	  return b;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int updateRow(Blog b) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  session.saveOrUpdate(b);
	  tx.commit();
	  Serializable id = session.getIdentifier(b);
	  session.close();
	  return (Integer) id;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int deleteRow(int id) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  Blog b = (Blog) session.load(Blog.class, id);
	  session.delete(b);
	  tx.commit();
	  Serializable ids = session.getIdentifier(b);
	  session.close();
	  return (Integer) ids;
	 }

}