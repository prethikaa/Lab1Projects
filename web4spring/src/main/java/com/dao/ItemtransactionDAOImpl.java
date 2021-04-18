package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Itemtransaction;

@Repository
public class ItemtransactionDAOImpl implements ItemtransactionDAO{
	@Autowired
	private SessionFactory factory;
	
	public final SessionFactory getFactory() {
		return factory;
	}
	public final void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
@Override
public void createItemtransaction(Itemtransaction itemtransaction) {
//	Session session=factory.openSession();
//	session.save(user);
//	session.beginTransaction().commit();
	
	Session session=factory.getCurrentSession();
	session.persist(itemtransaction);
}
}