package org.trysol.service;

import org.trysol.dto.Customer;

import java.util.List;

public interface CustomerService {

    Customer createCustomer(Customer customer);
    List<Customer> getCustomers();

}
