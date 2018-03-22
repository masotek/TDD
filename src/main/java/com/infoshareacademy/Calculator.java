package com.infoshareacademy;

import java.util.Arrays;

public class Calculator {

    public Integer add(Integer[] params) {
        Integer result = 0;
        for (Integer param : params ) {
            result += param;
        }

        return result;
    }
}
