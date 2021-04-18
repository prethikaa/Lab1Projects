package com.dao;


import java.util.List;

import com.model.Item;
public interface ItemDAO {
	public void createItem(Item item);
	public List<Item> selectItemsByCategory(String category);
	public Item getItemByID(int itemno);
}
