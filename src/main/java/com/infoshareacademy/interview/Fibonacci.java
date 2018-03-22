package com.infoshareacademy.interview;

public class Fibonacci {

    public void printElementAtIndex(int index) {
        int num1 = 1;
        int num2 = 1;
        int elementAtIndex = 0;

        for (int i = 0; i < index - 2; i++) {
            elementAtIndex = num1 + num2;
            num1 = num2;
            num2 = elementAtIndex;
        }
        System.out.print(elementAtIndex);
    }
}
