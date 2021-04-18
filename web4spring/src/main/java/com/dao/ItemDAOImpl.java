package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Item;

@Repository
public class ItemDAOImpl implements ItemDAO{
	@Autowired
	private SessionFactory factory;
	
	public final SessionFactory getFactory() {
		return factory;
	}
	public final void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
@Override
public void createItem(Item item) {
//	Session session=factory.openSession();
//	session.save(user);
//	session.beginTransaction().commit();
	
	Session session=factory.getCurrentSession();
	session.persist(item);
}
@Override
public List<Item> selectItemsByCategory(String category) {
	Session session=factory.getCurrentSession();
	Query query=session.createQuery("from Item where category = :category");
	query.setString("category", category);
	List<Item> list= (List<Item>) query.list();
	return list;
}
@Override
public Item getItemByID(int itemno) {
	Session session=factory.getCurrentSession();
	return (Item) session.get(Item.class, itemno);
}
}