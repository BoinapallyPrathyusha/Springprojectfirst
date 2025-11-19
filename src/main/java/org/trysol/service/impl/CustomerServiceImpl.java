package org.trysol.service.impl;

import org.springframework.stereotype.Service;
import org.trysol.dto.Customer;
import org.trysol.service.CustomerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer createCustomer(Customer customer) {
        customers.add(customer);
        return customer;
    }

    @Override
    public List<Customer> getCustomers() {
        return customers;
    }

    private List<Customer> customers = new ArrayList<>();
    {
        customers.add(Customer.builder()
                .name("Srinivas")
                .department("R&D")
                .email("srini02@gmail.com")
                .build());
        customers.add(Customer.builder()
                .name("Vinod")
                .department("Finance")
                .email("vinod@gmail.com")
                .build());
    }
}
