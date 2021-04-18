package com.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Customer implements Comparable<Customer>, Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;
	
	private String customerName;
	private String customerAddress;
	private String customerEmail;
	private String customerPhone;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerId", referencedColumnName = "uid")
	private User user;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int customerId, String customerName, String customerAddress, String customerEmail,
			String customerPhone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerEmail = customerEmail;
		this.customerPhone = customerPhone;
	}


	public Customer getClone() {
		try {
			return (Customer) super.clone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public final int getCustomerId() {
		return customerId;
	}
	public final void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public final String getCustomerName() {
		return customerName;
	}
	public final void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public final String getCustomerAddress() {
		return customerAddress;
	}
	public final void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public final String getCustomerEmail() {
		return customerEmail;
	}
	public final void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public final String getCustomerPhone() {
		return customerPhone;
	}
	public final void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public final User getUser() {
		return user;
	}
	public final void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + ((customerEmail == null) ? 0 : customerEmail.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((customerPhone == null) ? 0 : customerPhone.hashCode());
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
		Customer other = (Customer) obj;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerEmail == null) {
			if (other.customerEmail != null)
				return false;
		} else if (!customerEmail.equals(other.customerEmail))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerPhone == null) {
			if (other.customerPhone != null)
				return false;
		} else if (!customerPhone.equals(other.customerPhone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerEmail=" + customerEmail + ", customerPhone=" + customerPhone + "]";
	}
	@Override
	public int compareTo(Customer o) {
		return this.customerName.compareTo(o.customerName);
	}
}
