package com.org.controller;

import com.org.controller.vo.Customer;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@Validated
public class ValidatedController {

    @PostMapping(value = "/validated1")
    @ResponseBody
    public String validated1(@RequestBody Customer customer){
        return "success";
    }


    @PostMapping(value = "/validated2")
    @ResponseBody
    public String validated2(@RequestBody @Valid  Customer customer){
        return "success";
    }

    @PostMapping(value = "/validated3/{id}")
    @ResponseBody
    public String validated3(@PathVariable("id") @Min(5) int id, @RequestParam("param") @Min(5) int param){
        return "success";
    }

}
