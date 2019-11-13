package com.org.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class InIntArrValidator  implements ConstraintValidator<InIntArr, Integer> {
    private int[] intArr;

    @Override
    public void initialize(InIntArr inIntArr) {
        intArr = inIntArr.value();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if (null == value) {
            return false;
        }

        if (null == intArr || intArr.length < 1) {
            return false;
        }

        for (int i : intArr) {
            if (i == value.intValue()) {
                return true;
            }
        }
        return false;
    }
}
