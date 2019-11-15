package com.org;

import com.org.controller.vo.Customer;
import com.org.feign.ValidateFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FeignController {

    @Autowired
    private ValidateFeign validateFeign;

    @PostMapping(value = "/addGroupMethodFeign")
    @ResponseBody
    public String addGroupMethod(){
        Customer customer = new Customer();
        customer.setId(1L);
        return validateFeign.obj(customer);
    }
}
