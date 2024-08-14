package com.ofss.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.ofss.main.domain.CustomerDetails;

public interface CustomerRegistration extends CrudRepository<CustomerDetails, Integer>{
}
