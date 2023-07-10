package com.example.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.user.dto.CustomerDto;
import com.example.user.entity.Customer;
import com.example.user.repository.CustomerRepository;

import jakarta.persistence.Entity;
import jakarta.transaction.Transactional;

@Entity
@Transactional
public class CustomerServiceImp implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public String registerNewCustomer(CustomerDto customerDto) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setCustomerEmailId(customerDto.getCustomerEmailId());
		customer.setContactNumber(customerDto.getContactNumber());
		customer.setCustomerId(customerDto.getCustomerId());
		customer.setCustomerName(customerDto.getCustomerName());
		customer.setDateOfBirth(customerDto.getDateOfBirth());
		customer.setGender(customerDto.getGender());
		customer.setPassword(customerDto.getPassword());
		customerRepository.save(customer);
		
		return "Customer Registered Successfully";
	}

	@Override
	public CustomerDto viewCustomer(String customerEmailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerDto> viewAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCustomer(String customerEmailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCustomer(CustomerDto customerDto, String customerEmailId) {
		// TODO Auto-generated method stub
		return null;
	}

}
