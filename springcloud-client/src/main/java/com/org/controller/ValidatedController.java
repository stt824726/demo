package com.org.controller;

import com.org.controller.vo.Customer;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@RestController
@Validated
public class ValidatedController {

    /**
     * 只在类上加@Validated，在方法上不加@Valid，校验不开启
     * @param customer
     * @return
     */
    @PostMapping(value = "/validated1")
    @ResponseBody
    public String validated1(@RequestBody Customer customer){
        return "success";
    }

    /**
     * 在类上加@Validated，在方法上加@Valid，校验开启
     * @param customer
     * @return
     */
    @PostMapping(value = "/validated2")
    @ResponseBody
    public String validated2(@RequestBody @Valid  Customer customer){
        return "success";
    }

    /**
     * 在类上加@Validated，在方法上加校验，开启
     * @param id
     * @param param
     * @return
     */
    @PostMapping(value = "/validated3/{id}")
    @ResponseBody
    public String validated3(@PathVariable("id") @Min(5) int id, @RequestParam("param") @Min(5) int param){
        return "success";
    }

}
