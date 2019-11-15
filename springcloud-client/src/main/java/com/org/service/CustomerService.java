package com.org.service;

import com.org.controller.vo.Customer;
import com.org.controller.vo.OnCreate;
import com.org.controller.vo.OnUpdate;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Service
@Validated
public class CustomerService {

    public String custome(@Valid Customer customer){
        return "custome" ;
    }

    @Validated(OnCreate.class)
    public String addGroup(@Validated({OnCreate.class}) Customer customer){
        return "custome" ;
    }

    @Validated(OnUpdate.class)
    public String updateGroup(@Validated({OnUpdate.class}) Customer customer){
        return "custome" ;
    }
}
