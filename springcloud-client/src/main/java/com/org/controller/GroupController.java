package com.org.controller;

import com.org.controller.vo.Customer;
import com.org.controller.vo.OnCreate;
import com.org.controller.vo.OnUpdate;
import com.org.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class GroupController {


    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/addGroup")
    @ResponseBody
    public String addGroup(@RequestBody @Validated({OnCreate.class}) Customer customer){
        return "addGroup";
    }


    @PostMapping(value = "/updateGroup")
    @ResponseBody
    public String updateGroup(@RequestBody @Validated({OnUpdate.class}) Customer customer){
        return "updateGroup";
    }


    @PostMapping(value = "/addGroupMethod")
    @ResponseBody
    public String addGroupMethod(){
        Customer customer = new Customer();
        customer.setId(1L);
        return customerService.addGroup(customer);
    }


    @PostMapping(value = "/updateGroupMethod")
    @ResponseBody
    public String updateGroupMethod(){
        Customer customer = new Customer();
        customer.setId(1L);
        return customerService.updateGroup(customer);
    }
}
