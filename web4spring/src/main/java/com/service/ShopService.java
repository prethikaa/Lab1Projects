package com.service;

import java.util.HashMap;
import java.util.List;

import com.dao.AllDetails;
import com.model.Item;

public interface ShopService {
	public List<Item> selectItemsByCategory(String category);
	public AllDetails createInvoice(int uid, HashMap<Integer,Integer> hm);
	public void createPDF(AllDetails allDetails);
	public void createExcel(AllDetails allDetails);
	public void sendMail(AllDetails allDetails);
	public void sendSMS(AllDetails allDetails);
	
}
