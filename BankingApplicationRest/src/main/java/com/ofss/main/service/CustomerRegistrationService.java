package com.ofss.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ofss.main.domain.CustomerDetails;

@Service
public interface CustomerRegistrationService {
	public CustomerDetails addNewCustomer(CustomerDetails customer);
	public CustomerDetails getCustomerByCustomerId(int customerId);
	public CustomerDetails updateExistingCustomer(CustomerDetails customer);
	public boolean deleteCustomerByCustomerId(int customerId);
	public List<CustomerDetails> getAllCustomers();
    
}
