package com.example.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.user.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
