package com.infoshareacademy;

import org.junit.Test;
import org.mockito.InjectMocks;

import static org.junit.Assert.*;

public class CalculatorTest {

    public Calculator calculator = new Calculator();

    @Test
    public void addCorrectValues() {
        //GIVEN
        Integer a = 2;
        Integer b = 4;
        Integer expected = a + b;

        //WHEN
        Integer result = calculator.add(new Integer[]{a,b});

        //THEN
        assertEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void addIncorrectValues() {
        //GIVEN
        Integer a = 2;
        Integer b = null;

        //WHEN
        Integer result = calculator.add(new Integer[]{a,b});
    }

    @Test
    public void addManyValues() {
        //GIVEN
        Integer[] params = {1, 2, 3, 4};
        Integer expected = 1 + 2 + 3 + 4;

        //WHEN
        Integer result = calculator.add(params);

        //THEN
        assertEquals(expected, result);
    }

}