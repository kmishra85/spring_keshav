package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.model.CustomerDetails;
import com.cg.service.ICustomerService;





@Controller
public class CustomerController {
	
	
	
	int val=0;
	
	@Autowired
	ICustomerService service;
	
	
	
	
	@RequestMapping(value="/start",method=RequestMethod.GET)
	public ModelAndView goTostart()
	{
		
		return new ModelAndView("CustomerRegForm","cust",new CustomerDetails());
	}
	

	
	@RequestMapping("/index")
	public String go()
	{
		return "index";
	}
	
	@RequestMapping("/find")
	public ModelAndView findForm(Model m)
	{
		List<String> li=service.getId();
		m.addAttribute("customer",new CustomerDetails());
		return new ModelAndView("findCust","key1",li);
		
	}
	
	@RequestMapping("/findAll")
	public ModelAndView getAll(Model m)
	{
		List<CustomerDetails> li=service.getAll();
		m.addAttribute("customer",new CustomerDetails());
			return new ModelAndView("AllCustomers","key1",li);
	
	}
	
/*	@RequestMapping("/list")
	public ModelAndView list()
	{
		
		return new ModelAndView("AllCustomer","li",service.getAll());
		
	}*/
	
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("cust") @Valid CustomerDetails cust,BindingResult result)
	{
	

	
			service.addCustomerDetails(cust);
		
		return new ModelAndView("insertSuccess");
	}
	
	
	@RequestMapping("/findCustomer")
	public ModelAndView findById(@RequestParam("customerId") String id)
	{
		
		CustomerDetails cust= service.getRecord(id);
		return new ModelAndView("found","rec",cust);
	}
	@RequestMapping("/update")
	public ModelAndView updateCustomer(@RequestParam int customerId)
	{
		String id=String.valueOf(customerId);
		return new ModelAndView("updateForm","cust",service.getRecord(id));
		
	}
	
	public String doUpdate()
	{
		return null;
		
	}
	
@RequestMapping(value="/updateSuccess",method=RequestMethod.POST)
	public ModelAndView Update(@ModelAttribute("cust") @Valid CustomerDetails cd,BindingResult result)
	{
		service.updateCustomerDetails(cd);
		return new ModelAndView("updateSuccess");
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteById(@RequestParam("customerId") String id)
	{
		System.out.println(id);
		if(service.deleteCustomer(id))
		{
			System.out.println("\nDeleted Successfully!");
		}
		else
		{
			System.out.println("\nDeletion error!");
		}
		
		return new ModelAndView("deleteSuccess");
		
	}
	
	
}
