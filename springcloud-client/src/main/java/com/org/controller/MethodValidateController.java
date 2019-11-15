package com.org.controller;

import com.org.controller.vo.Customer;
import com.org.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MethodValidateController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/methodValidate")
    @ResponseBody
    public String methodValidate(){
        Customer customer = new Customer();
        customer.setId(1L);
        customerService.custome(customer);
        return "success";
    }
}
