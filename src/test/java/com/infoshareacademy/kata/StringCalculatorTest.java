package com.infoshareacademy.kata;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    public StringCalculator testee = new StringCalculator();

    String insert;
    Integer expected;
    Integer result;

    @Test
    public void addGivenEmptyStringThenZero() {
        //GIVEN
        insert = "";
        expected = 0;

        //WHEN
        result = testee.add(insert);

        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void addGivenOneParameter() {
        //GIVEN
        insert = "97";
        expected = 97;

        //WHEN
        result = testee.add(insert);

        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void addGivenTwoParametersThenSum() {
        //GIVEN
        insert = "1,2,3";
        expected = 6;

        //WHEN
        result = testee.add(insert);

        //THEN
        assertEquals(expected, result);
    }

    @Test(expected = NumberFormatException.class)
    public void addGivenIncorrectParametersThenException() {
        //GIVEN
        insert = "avx, 12";

        //WHEN
        result = testee.add(insert);
    }

    @Test(expected = NullPointerException.class)
    public void addGivenNullParameterThenException() {
        //GIVEN
        insert = null;

        //WHEN
        result = testee.add(insert);
    }

    @Test
    public void addUnknownAmountOfNumbers() {
        //GIVEN
        Random random = new Random();
        int parametersAmount = random.nextInt(20);
        expected = 0;
        insert = "";

        for (int i = 0; i < parametersAmount; i++) {
            int temp = random.nextInt(100);
            expected += temp;
            insert += temp;
            insert += ",";
        }

        //WHEN
        result = testee.add(insert);

        //THEN
        assertEquals(expected, result);
    }

    @Test
    public void addGivenNewLineDelimiter() {
        //GIVEN
        String delimiter = "\n";
        insert = "1\n2\n3";
        expected = 6;
        testee.setDelimiter(delimiter);

        //WHEN
        result = testee.add(insert);

        //THEN
        assertEquals(expected, result);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void addGivenNegativeNumberThenException() {
        //GIVEN
        insert = "1,2,3,-4";

        //WHEN
        result = testee.add(insert);
    }

    @Test
    public void addAvoidingBigNumbers() {
        //GIVEN
        insert = "1,3,1003";
        expected = 4;

        //WHEN
        result = testee.add(insert);

        //THEN
        assertEquals(expected, result);
    }
}