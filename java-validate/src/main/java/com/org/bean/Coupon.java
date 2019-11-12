package com.org.bean;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Coupon {

    @NotNull(message = "优惠券id不能为空")
    private Integer id;

    private String name;
}
