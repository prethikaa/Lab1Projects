package com.dao;

import java.util.HashMap;

import com.model.Customer;
import com.model.Item;

public class AllDetails {
	private HashMap<Item,Integer> hm;
	private Customer customer;
	private String date;
	private int invno;
	
	public final int getInvno() {
		return invno;
	}
	public final void setInvno(int invno) {
		this.invno = invno;
	}
	public final HashMap<Item, Integer> getHm() {
		return hm;
	}
	public final void setHm(HashMap<Item, Integer> hm) {
		this.hm = hm;
	}
	
	public final Customer getCustomer() {
		return customer;
	}
	public final void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public final String getDate() {
		return date;
	}
	public final void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "AllDetails [hm=" + hm + ", customer=" + customer + ", date=" + date + "]";
	}
	
	
}
