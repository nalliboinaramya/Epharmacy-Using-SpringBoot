package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.dto.CustomerDto;
import com.example.user.service.CustomerService;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(value = "/addcustomer")
	public ResponseEntity<String> registerNewCustomer(CustomerDto customerDto){
		String str = customerService.registerNewCustomer(customerDto);
		return new ResponseEntity<String> (str,HttpStatus.OK);
	}

}
