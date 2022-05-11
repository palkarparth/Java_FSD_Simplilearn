package com.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;

@Entity
@Table(name = "CustomerTable")
@Builder
public class Customers {

	@Id
	private String customerEmail;
	private String customerPassword;
	private String customerName;
	@Column(unique = true)
	private String customerMobile;
	private String customerAddress;
	private String customerPincode;
	

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerMobile() {
		return customerMobile;
	}

	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPincode() {
		return customerPincode;
	}

	public void setCustomerPincode(String customerPincode) {
		this.customerPincode = customerPincode;
	}

	public Customers(String customerEmail, String customerPassword, String customerName, String customerMobile,
			String customerAddress, String customerPincode) {
		super();
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.customerName = customerName;
		this.customerMobile = customerMobile;
		this.customerAddress = customerAddress;
		this.customerPincode = customerPincode;
	}

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}