package org.trysol.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.trysol.dto.Customer;
import org.trysol.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @PostMapping()
    public Customer createCustomer(@RequestBody @Valid Customer customer) throws JsonProcessingException {
        return this.customerService.createCustomer(customer);
    }

    @GetMapping()
    public List<Customer> getCustomer(){
        return customerService.getCustomers();
    }

}
