package com.org.controller;

import com.org.controller.vo.Customer;
import com.org.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@RestController
public class ValidateControler {

    @Autowired
    private CustomerService customerService;

    @PostMapping(value = "/valid")
    @ResponseBody
    public String customer(@RequestBody @Valid Customer customer){
        return "success";
    }


    @PostMapping(value = "/valid2")
    @ResponseBody
    public String customer2(@RequestBody @Valid Customer customer, BindingResult bindingResult){
        StringBuffer stringBuffer = new StringBuffer();
        if(bindingResult.hasErrors()){
            List<ObjectError> list =bindingResult.getAllErrors();
            for (ObjectError objectError : list) {
                stringBuffer.append(((FieldError) objectError).getField() + objectError.getDefaultMessage());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer!=null?stringBuffer.toString():"";
    }


    @PostMapping(value = "/valid3")
    @ResponseBody
    public String customer3(@RequestBody @Validated Customer customer){
        return "success";
    }
}
