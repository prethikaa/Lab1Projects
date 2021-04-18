package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item implements  Cloneable, Serializable  {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemno;
	private String itemdescription;
	private int itemprice;
	private String itemunit;
	private String category;
	private String image;
	public final int getItemno() {
		return itemno;
	}
	public final void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public final String getItemdescription() {
		return itemdescription;
	}
	public final void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}
	public final int getItemprice() {
		return itemprice;
	}
	public final void setItemprice(int itemprice) {
		this.itemprice = itemprice;
	}
	public final String getItemunit() {
		return itemunit;
	}
	public final void setItemunit(String itemunit) {
		this.itemunit = itemunit;
	}
	public final String getCategory() {
		return category;
	}
	public final void setCategory(String category) {
		this.category = category;
	}
	public final String getImage() {
		return image;
	}
	public final void setImage(String image) {
		this.image = image;
	}
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Item(int itemno, String itemdescription, int itemprice, String itemunit, String category, String image) {
		super();
		this.itemno = itemno;
		this.itemdescription = itemdescription;
		this.itemprice = itemprice;
		this.itemunit = itemunit;
		this.category = category;
		this.image = image;
	}
	
	public Item getClone() {
		try {
			return (Item) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;}
		}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((itemdescription == null) ? 0 : itemdescription.hashCode());
		result = prime * result + itemno;
		result = prime * result + itemprice;
		result = prime * result + ((itemunit == null) ? 0 : itemunit.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (itemdescription == null) {
			if (other.itemdescription != null)
				return false;
		} else if (!itemdescription.equals(other.itemdescription))
			return false;
		if (itemno != other.itemno)
			return false;
		if (itemprice != other.itemprice)
			return false;
		if (itemunit == null) {
			if (other.itemunit != null)
				return false;
		} else if (!itemunit.equals(other.itemunit))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Item [itemno=" + itemno + ", itemdescription=" + itemdescription + ", itemprice=" + itemprice
				+ ", itemunit=" + itemunit + ", category=" + category + ", image=" + image + "]";
	}

	
}
