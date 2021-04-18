package com.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerDAO;
import com.dao.ItemDAO;
import com.dao.UserDAO;
import com.model.Customer;
import com.model.Item;
import com.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDAO userDao;
	
	@Autowired
	private CustomerDAO customerDAO;
	
	public final UserDAO getUserDao() {
		return userDao;
	}
	public final void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	public final CustomerDAO getCustomerDAO() {
		return customerDAO;
	}
	public final void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	
	@Autowired
	private ItemDAO itemDAO;
	
	
	public final ItemDAO getItemDAO() {
		return itemDAO;
	}
	public final void setItemDAO(ItemDAO itemDAO) {
		this.itemDAO = itemDAO;
	}
@Override
public void createCustomer(Customer customer) {
	customerDAO.createCustomer(customer);
}


@Override
public int checkUser(User user) {
	String uname = user.getUname();
	User userFromDB = userDao.getUserByUname(uname);
	if(userFromDB.getUpass().equals(user.getUpass())) {
		return userFromDB.getUid();
	}
	else {
		return 0;
	}
	
}
@Override
public void createItem(Item item) {
	itemDAO.createItem(item);
	
}
}
