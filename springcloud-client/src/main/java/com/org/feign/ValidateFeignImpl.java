package com.org.feign;

import com.org.controller.vo.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ValidateFeignImpl implements ValidateFeign{

    @Override
    public String obj(Customer customer) {
        return "success";
    }

    @Override
    public String path(Long storeId, Integer id) {
        return "success";
    }

}
