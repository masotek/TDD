package com.infoshareacademy.interview;

public class IntegerPalindrom {

    public boolean isPalindrom(Integer number) {
        Integer temp = number;

        Integer result = 0;
        while (temp != 0) {
            int remain = temp % 10;
            result = result * 10 + remain;
            temp /= 10;
        }

        if (number.equals(result)) {
            return true;
        }
        return false;
    }
}
