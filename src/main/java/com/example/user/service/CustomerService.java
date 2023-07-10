package com.example.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.user.dto.CustomerDto;

import jakarta.transaction.Transactional;

@Service
public interface CustomerService {
	String registerNewCustomer(CustomerDto customerDto);
	CustomerDto viewCustomer(String customerEmailId);
	List<CustomerDto> viewAllCustomers();
	String deleteCustomer(String customerEmailId);
	String updateCustomer(CustomerDto customerDto,String customerEmailId);



}
