package com.raj.nola.order.web.rest;

import com.raj.nola.order.entity.Customer;
import com.raj.nola.order.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepo;

    @RequestMapping("/customers")
    @ResponseBody
    public ResponseEntity<List<Customer>> getAllItems(){
        List<Customer> items =  customerRepo.findAll();
        return new ResponseEntity<List<Customer>>(items, HttpStatus.OK);
    }

}
