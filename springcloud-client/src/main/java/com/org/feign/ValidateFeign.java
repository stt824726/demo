package com.org.feign;

import com.org.controller.vo.Customer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.Min;

@FeignClient(value="wl-service")
@Validated
public interface ValidateFeign {

    @RequestMapping(method = RequestMethod.POST, value= "/feign/validate/customer/obj")
    String obj(@Valid Customer customer);

    @RequestMapping(method = RequestMethod.GET, value= "/feign/validate/customer/obj/{id}", consumes = "application/json")
    String path(@PathVariable("storeId")@Min(5) Long storeId, @RequestParam @Min(10)Integer id);
}
