package com.ofss.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofss.main.domain.CustomerDetails;
import com.ofss.main.service.CustomerRegistrationService;

@RestController
@RequestMapping("registration")
public class CustomerRegistrationController {
    @Autowired
	private CustomerRegistrationService customerRegistrationService;
    @PostMapping("customer")
	public CustomerDetails addNewEmployeeToDB(@RequestBody CustomerDetails customerDetails) {
		return customerRegistrationService.addNewCustomer(customerDetails);
	}
    @GetMapping("customer/{customer_id}")
    public CustomerDetails getCustomerById(@PathVariable int customer_id){
        return customerRegistrationService.getCustomerByCustomerId(customer_id);
    }
    @PutMapping("updatecustomer")
    public CustomerDetails updateCustomerById(@RequestBody CustomerDetails customerDetails){
        return customerRegistrationService.updateExistingCustomer(customerDetails);
    }
    
    @DeleteMapping("delete/{customer_id")
    public boolean deleteCustomerFromDB(@PathVariable int customer_id) {
    	return customerRegistrationService.deleteCustomerByCustomerId(customer_id);
    }
    
    @GetMapping("allcustomers")
    public List<CustomerDetails> getAllCustomersFromDB(){
    	return customerRegistrationService.getAllCustomers();
    }
    
    
}
