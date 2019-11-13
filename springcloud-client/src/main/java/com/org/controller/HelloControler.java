package com.org.controller;

import com.org.controller.vo.Customer;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class HelloControler {

    @PostMapping(value = "/customer")
    @ResponseBody
    public String customer(@RequestBody @Valid Customer customer){
        return "success";
    }


    @PostMapping(value = "/customer2")
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
}
