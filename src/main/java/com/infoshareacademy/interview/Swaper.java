package com.infoshareacademy.interview;

public class Swaper {

    public void swapNumbers(int a, int b) {
        print(a, b);

        a = a + b;
        b = a - b;
        a = a - b;

        print(a, b);
    }

    private void print(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
}
