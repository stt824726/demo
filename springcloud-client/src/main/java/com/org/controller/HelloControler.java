package com.org.controller;

import com.org.controller.vo.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class HelloControler {

    @PostMapping(value = "/customer")
    public String customer(@RequestBody @Valid Customer customer){
        return "success";
    }
}
