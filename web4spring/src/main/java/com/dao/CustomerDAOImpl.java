package com.dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	@Autowired
	private SessionFactory factory;
	
	public final SessionFactory getFactory() {
		return factory;
	}
	public final void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
@Override
public void createCustomer(Customer customer) {
//	Session session=factory.openSession();
//	session.save(user);
//	session.beginTransaction().commit();
	
	Session session=factory.getCurrentSession();
	session.persist(customer);
}
@Override
public String getCustomerNameById(int customerId) {
	Session session=factory.getCurrentSession();
	Query query=session.createQuery("from Customer where customerId = :customerId");
	query.setInteger("customerId", customerId);
	Customer customer = (Customer)query.uniqueResult();
	return customer.getCustomerName();

}
@Override
public Customer getcustomer(int customerId) {
	Session session=factory.getCurrentSession();
	Query query=session.createQuery("from Customer where customerId = :customerId");
	query.setInteger("customerId", customerId);
	Customer customer = (Customer)query.uniqueResult();
	return customer;
}

}