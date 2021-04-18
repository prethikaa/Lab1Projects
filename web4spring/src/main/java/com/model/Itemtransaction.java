package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Itemtransaction implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int itemtransactionno;
	private int invno;
	private int itemno;
	private int itemqty;
	
	public final int getItemtransactionno() {
		return itemtransactionno;
	}
	public final void setItemtransactionno(int itemtransactionno) {
		this.itemtransactionno = itemtransactionno;
	}
	public final int getInvno() {
		return invno;
	}
	public final void setInvno(int invno) {
		this.invno = invno;
	}
	public final int getItemno() {
		return itemno;
	}
	public final void setItemno(int itemno) {
		this.itemno = itemno;
	}
	public final int getItemqty() {
		return itemqty;
	}
	public final void setItemqty(int itemqty) {
		this.itemqty = itemqty;
	}
	public Itemtransaction() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Itemtransaction(int itemtransactionno, int invno, int itemno, int itemqty) {
		super();
		this.itemtransactionno = itemtransactionno;
		this.invno = invno;
		this.itemno = itemno;
		this.itemqty = itemqty;
	}
	public Itemtransaction getClone() {
		try {
			return (Itemtransaction) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;}
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + invno;
		result = prime * result + itemno;
		result = prime * result + itemqty;
		result = prime * result + itemtransactionno;
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
		Itemtransaction other = (Itemtransaction) obj;
		if (invno != other.invno)
			return false;
		if (itemno != other.itemno)
			return false;
		if (itemqty != other.itemqty)
			return false;
		if (itemtransactionno != other.itemtransactionno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Itemtransaction [itemtransactionno=" + itemtransactionno + ", invno=" + invno + ", itemno=" + itemno
				+ ", itemqty=" + itemqty + "]";
	}
	
	
}



