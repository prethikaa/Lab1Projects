package com.dao;

import com.model.Customer;

public interface CustomerDAO {
	public String getCustomerNameById(int customerId);
	public void createCustomer(Customer customer);
	public Customer getcustomer(int customerId);
}
