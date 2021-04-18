package com.dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDAOImpl implements UserDAO{
	@Autowired
	private SessionFactory factory;
	
	public final SessionFactory getFactory() {
		return factory;
	}
	public final void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
@Override
public void createUser(User user) {
//	Session session=factory.openSession();
//	session.save(user);
//	session.beginTransaction().commit();
	
	Session session=factory.getCurrentSession();
	session.persist(user);
}
@Override
public User getUserByUname(String uname) {
	Session session=factory.getCurrentSession();
	Query query=session.createQuery("from User where uname = :uname");
	query.setString("uname", uname);
	User user= (User) query.uniqueResult();
	return user;
}
}
