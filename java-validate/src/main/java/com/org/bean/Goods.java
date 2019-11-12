package com.org.bean;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class Goods {

    @NotNull(message = "产品id不能为空")
    private Integer id;

    private String name;

}
