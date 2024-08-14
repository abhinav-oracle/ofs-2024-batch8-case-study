package com.ofss.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofss.main.domain.CustomerDetails;
import com.ofss.main.repository.CustomerRegistration;

@Service
public class CustomerRegistrationServiceImpl implements CustomerRegistrationService{
	@Autowired
	private CustomerRegistration customerRepository;

	@Override
	public CustomerDetails addNewCustomer(CustomerDetails customer) {
		return customerRepository.save(customer);
	}

	@Override
	public CustomerDetails getCustomerByCustomerId(int customerId) {
		Optional<CustomerDetails>customerOptional = customerRepository.findById(customerId);
		if(customerOptional.isPresent()) {
			return customerOptional.get();
		}
		return null;
	}

	@Override
	public CustomerDetails updateExistingCustomer(CustomerDetails customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public boolean deleteCustomerByCustomerId(int customerId) {
		Optional<CustomerDetails>customerOptional = customerRepository.findById(customerId);
		if(customerOptional.isPresent()) {
			CustomerDetails customer = customerOptional.get();
			customerRepository.delete(customer);
			return true;
		}
		return false;
	}

	@Override
	public List<CustomerDetails> getAllCustomers() {
		List<CustomerDetails> listOfCustomers = (List<CustomerDetails>) customerRepository.findAll();
		return listOfCustomers;
	}

	


}