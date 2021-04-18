package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Invoice;

@Repository
public class InvoiceDAOImpl implements InvoiceDAO{
	@Autowired
	private SessionFactory factory;
	
	public final SessionFactory getFactory() {
		return factory;
	}
	public final void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
@Override
public int createInvoice(Invoice invoice) {
//	Session session=factory.openSession();
//	session.save(user);
//	session.beginTransaction().commit();
	
	Session session=factory.getCurrentSession();
	session.persist(invoice);
	return invoice.getInvno();
}
}