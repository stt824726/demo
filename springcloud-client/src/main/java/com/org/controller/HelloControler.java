package com.org.controller;

import com.org.controller.vo.Customer;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class HelloControler {

    @PostMapping(value = "/customer")
    @ResponseBody
    public String customer(@RequestBody @Valid Customer customer){
        return "success";
    }
}
