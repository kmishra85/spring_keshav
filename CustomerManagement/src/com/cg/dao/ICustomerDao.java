package com.cg.dao;

import java.util.List;

import com.cg.model.CustomerDetails;

public interface ICustomerDao {

	int addCustomerDetails(CustomerDetails cust);

	CustomerDetails getRecord(String id);

	List<CustomerDetails> getAll();

	boolean deleteCustomer(String id);

	void updateCustomerDetails(CustomerDetails cd);

	List<String> getId();

}
