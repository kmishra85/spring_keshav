package com.cg.service;



import java.util.List;

import com.cg.model.CustomerDetails;


public interface ICustomerService {

	int addCustomerDetails(CustomerDetails cust);

	CustomerDetails getRecord(String id);

	List<CustomerDetails> getAll();

	boolean deleteCustomer(String id);

	void updateCustomerDetails(CustomerDetails cd);

	List<String> getId();
}
