package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




import com.cg.dao.ICustomerDao;
import com.cg.model.CustomerDetails;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService{
	
	@Autowired
	ICustomerDao dao;
	public int addCustomerDetails(CustomerDetails cust) {
		
		return dao.addCustomerDetails(cust);
	}

	public CustomerDetails getRecord(String id) {

		return dao.getRecord(id);
	}

	@Override
	public List<CustomerDetails> getAll() {
	
		return dao.getAll();
	}

	@Override
	public boolean deleteCustomer(String id) {
		
		return dao.deleteCustomer(id);
	}

	@Override
	public void updateCustomerDetails(CustomerDetails cd) {
		dao.updateCustomerDetails(cd);
		
	}

	@Override
	public List<String> getId() {
	
		return dao.getId();
	}

}
