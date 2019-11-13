package com.org.bean;

import com.org.constraints.InIntArr;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Customer<T> {

    private Integer id;

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

    @DecimalMin(value="100",message = "订单金额不能小于100")
    private BigDecimal orderAmount;

    @Size(min = 6,max = 30,message = "地址长度应该在6-30字符之间")
    private String address;

    @NotNull
    private BigDecimal payAmount;

    @InIntArr(value={0,1},message = "状态必须为0,1")
    private Integer status;

    @NotNull(message = "产品不能为空")
    @Valid
    private List<Goods> goods;

    @Valid
    private List<T> coupons;



}
