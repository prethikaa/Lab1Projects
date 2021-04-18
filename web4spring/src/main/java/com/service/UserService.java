package com.service;

import com.model.Customer;
import com.model.Item;
import com.model.User;

public interface UserService {
	public void createCustomer(Customer customer);
	public int checkUser(User user);
	public void createItem(Item item);
}
