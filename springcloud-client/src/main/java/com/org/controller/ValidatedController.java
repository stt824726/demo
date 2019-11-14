package com.org.controller;

import com.org.controller.vo.Customer;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Validated
public class ValidatedController {

    @PostMapping(value = "/validated")
    @ResponseBody
    public String validated(@RequestBody @Valid Customer customer){
        return "success";
    }

}
