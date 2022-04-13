package com.app.service;

import java.util.List;

import com.app.exception.CustomerNotFoundException;
import com.app.pojo.Customer;

public interface CustomerService {

	boolean existsById(Integer userId);

	boolean existsByMobileNumber(String mobileNo);

	boolean existsByEmail(String email);

	public Customer addCustomer(Customer customer) throws CustomerNotFoundException;

	public Customer removeCustomer(int customerid);

	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException;

	public Customer viewCustomer(int customerid);

	public List<Customer> viewCustomerList();
}
