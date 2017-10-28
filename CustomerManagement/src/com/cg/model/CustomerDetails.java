package com.cg.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="customer_t")
@NamedQueries(
		{@NamedQuery(name = "getAllDetails", query = "select c from CustomerDetails c"),
			@NamedQuery(name = "getId", query = "Select customerId from CustomerDetails cd"),
		}
)

public class CustomerDetails {

	
	@Id
	@Column(name="customerId")
	@NotEmpty(message="This is required field!")
	//@Pattern(regexp="[10]{2}[0-9]{1,}",message="customer id should not be blank!")
	private String customerId;
	
	@NotEmpty(message="This is required field!")
	//@Pattern(message="customer name cannot be null", regexp="[a-zA-Z]{1,}")
	@Column(name="customerName")
	private String customerName;
	
	@NotEmpty(message="This is required field!")
	@Column(name="customerMobile")
	//@Pattern(regexp = "[798]{1}[0-9]{9}", message="mobile number cannot be null, must be of 10 digits!")
	private String customerMobile;
	
	@NotEmpty(message="This is required field!")
	@Column(name="customerEmail")
	//@Pattern(regexp = "[a-zA-Z0-9]{1,}[@]{1}[a-zA-Z]{1,}[.][a-zA-Z]{3}" ,message="email id cannot be null")
	private String customerEmail;
	
	
	@Column(name="customerDOB")
	private Date customerDOB;
	
	
	
	public CustomerDetails()
	{
		
		
	}

	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getCustomerMobile() {
		return customerMobile;
	}


	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}


	public Date getCustomerDOB() {
		return customerDOB;
	}


	public void setCustomerDOB(Date customerDOB) {
		this.customerDOB = customerDOB;
	}

	public CustomerDetails(String customerName, String customerId,
			String customerMobile, String customerEmail, Date customerDOB) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerMobile = customerMobile;
		this.customerEmail = customerEmail;
		this.customerDOB = customerDOB;
	}

	@Override
	public String toString() {
		return "CustomerDetails [customerName=" + customerName
				+ ", customerId=" + customerId + ", customerMobile="
				+ customerMobile + ", customerEmail=" + customerEmail
				+ ", customerDOB=" + customerDOB + "]";
	}

	
	
	
	
}
