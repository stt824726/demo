package com.org.bean;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class User<T> {

    @NotBlank
    private String name;

    private String gender;

    @NotNull(message = "年龄不能为空")
    @Min(18)
    private int age;

    @Future(message = "业务日期必须更晚")
    private Date busineeDate;

    @Past(message = "出生日期必须更早")
    private Date birthDay;

    @Pattern(regexp = "^1(3|4|5|6|7|8|9)\\d{9}$",message = "手机号格式不正确")
    private String phone;

    @DecimalMin(value="100",message = "金额不能小于100")
    private BigDecimal buyAmount;

    @NotNull(message = "产品不能为空")
    @Valid
    private List<Goods> goods;

    @Valid
    private List<T> coupons;

}
