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

import com.chat.model.Replay;

@Repository("replayDAO")
public class ReplayDAOImbl implements ReplayDAO {


	@Autowired
	private SessionFactory sessionFactory;

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int insertRow(Replay r) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();	 
	  session.saveOrUpdate(r);
	  tx.commit();
	  Serializable id = session.getIdentifier(r);
	  session.close();
	  return (Integer) id;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public List getList() {
	  Session session = sessionFactory.openSession();
	  @SuppressWarnings("unchecked")
	  List pList = session.createQuery("from Replay").list();
	  session.close();
	  return pList;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public Replay getRowById(int id) {
	  Session session = sessionFactory.openSession();
	 Replay r = (Replay) session.load(Replay.class, id);
	  return r;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int updateRow(Replay r) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	  session.saveOrUpdate(r);
	  tx.commit();
	  Serializable id = session.getIdentifier(r);
	  session.close();
	  return (Integer) id;
	 }

	@Transactional(propagation=Propagation.SUPPORTS)
	 public int deleteRow(int id) {
	  Session session = sessionFactory.openSession();
	  Transaction tx = session.beginTransaction();
	 Replay r = (Replay) session.load(Replay.class, id);
	  session.delete(r);
	  tx.commit();
	  Serializable ids = session.getIdentifier(r);
	  session.close();
	  return (Integer) ids;
	 }

}




