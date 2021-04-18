package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Invoice implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int invno;
	private String invdate;
	private int customerno;
	public final int getInvno() {
		return invno;
	}
	public final void setInvno(int invno) {
		this.invno = invno;
	}
	public final String getInvdate() {
		return invdate;
	}
	public final void setInvdate(String invdate) {
		this.invdate = invdate;
	}
	public final int getCustomerno() {
		return customerno;
	}
	public final void setCustomerno(int customerno) {
		this.customerno = customerno;
	}
	public Invoice() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Invoice(int invno, String invdate, int customerno) {
		super();
		this.invno = invno;
		this.invdate = invdate;
		this.customerno = customerno;
	}

	public Invoice getClone() {
		try {
			return (Invoice) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;}
		}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customerno;
		result = prime * result + ((invdate == null) ? 0 : invdate.hashCode());
		result = prime * result + invno;
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
		Invoice other = (Invoice) obj;
		if (customerno != other.customerno)
			return false;
		if (invdate == null) {
			if (other.invdate != null)
				return false;
		} else if (!invdate.equals(other.invdate))
			return false;
		if (invno != other.invno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Invoice [invno=" + invno + ", invdate=" + invdate + ", customerno=" + customerno + "]";
	}

	

}
