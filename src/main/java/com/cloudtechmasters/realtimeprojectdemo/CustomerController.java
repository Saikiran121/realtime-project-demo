package com.cloudtechmasters.realtimeprojectdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
public class CustomerController {
    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers(){
	logger.info("Get All customers");
        Customer customer1=new Customer(100,"vamsikrm");
        Customer customer2=new Customer(200,"harsha");
        return Arrays.asList(customer1,customer2);
    }
}
