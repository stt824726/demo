package com.org.business;

import com.org.bean.Coupon;
import com.org.bean.Goods;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import com.org.bean.Customer;

import java.util.Set;
import java.util.stream.Collectors;

public class Validate {

    public static void main(String[] args) throws Exception{
        Customer<Coupon> user = new Customer();
        user.setName("seven");
        user.setGender("man");
        user.setAge(-1);
        user.setPhone("1582");
        user.setBusineeDate(new Date());
        user.setBirthDay(new SimpleDateFormat("yyyyMMdd").parse("20291112"));
        user.setOrderAmount(new BigDecimal("101"));
        user.setPayAmount(new BigDecimal("106"));

        Goods goods = new Goods();
        goods.setName("机油");
        user.setGoods(Arrays.asList(goods));

        Coupon coupon = new Coupon();
        coupon.setName("优惠券名称");
        user.setCoupons(Arrays.asList(coupon));

        Set<ConstraintViolation<Customer>> result = Validation.buildDefaultValidatorFactory().getValidator().validate(user);

        List<String> message
                = result.stream().map(v -> v.getPropertyPath() + " " + v.getMessage() + ": " + v.getInvalidValue())
                .collect(Collectors.toList());
        message.forEach(System.out::println);
    }
}
