package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;










import com.cg.model.CustomerDetails;


@Repository
@Transactional
public class CustomerDaoImpl implements ICustomerDao{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public int addCustomerDetails(CustomerDetails cust) {
	
		System.out.println(cust);
		em.persist(cust);
		em.flush();
		
		
		return 1;
	}

	@Override
	public CustomerDetails getRecord(String id) {
	
		
		CustomerDetails c=em.find(CustomerDetails.class, id);
		System.out.println(c);
		return c;
	}

	@Override
	public List<CustomerDetails> getAll() {
		
		Query q=em.createNamedQuery("getAllDetails");
		@SuppressWarnings("unchecked")
		List<CustomerDetails> li=q.getResultList();
		return li;
	}

	@Override
	public boolean deleteCustomer(String id) {
		CustomerDetails c=em.find(CustomerDetails.class, id);
		em.remove(c);
		return true;
		
	}

	@Override
	public void updateCustomerDetails(CustomerDetails cd) {
		if(cd!=null)
		{
			em.merge(cd);
			em.flush();
		}
		
		
	}

	@Override
	public List<String> getId() {
		Query q=em.createNamedQuery("getId");
		@SuppressWarnings("unchecked")
		List<String> li=q.getResultList();
		return li;
	}

}
