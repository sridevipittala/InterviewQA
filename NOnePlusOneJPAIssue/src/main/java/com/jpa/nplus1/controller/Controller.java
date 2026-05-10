package com.jpa.nplus1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.nplus1.entity.Customer;
import com.jpa.nplus1.repo.CustomerRepo;

@RestController
public class Controller {
	@Autowired
	private CustomerRepo customerRep;
	
	
	@PostMapping("/save")
	public Customer saveCustomer(@RequestBody Customer customer) {
		customerRep.save(customer);
		return customer;
		
	}
	@GetMapping("/")
	public List<Customer> getCustomersInfo() {
		return customerRep.findAll();
		
	}

}
