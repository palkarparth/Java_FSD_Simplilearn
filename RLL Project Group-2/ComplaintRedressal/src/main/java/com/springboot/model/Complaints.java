package com.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ComplaintsTable")
public class Complaints {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;
	
	private String customerEmail;
	private String pincode;
	private String complaint;
	private String status = "raised";
	
	

	public Complaints() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Complaints(int ticketId, String customerEmail, String pincode, String complaint, String status) {
		super();
		this.ticketId = ticketId;
		this.customerEmail = customerEmail;
		this.pincode = pincode;
		this.complaint = complaint;
		this.status = status;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
