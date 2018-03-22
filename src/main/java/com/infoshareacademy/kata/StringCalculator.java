package com.infoshareacademy.kata;

public class StringCalculator {

    private String delimiter = ",";

    public Integer add(String numbers) {
        if (numbers == null) {
            throw new NullPointerException();
        }

        if (numbers.isEmpty()) {
            return 0;
        }

        Integer result = calculateResult(numbers);

        return result;
    }

    private Integer calculateResult(String numbers) throws NumberFormatException {
        String[] tab = numbers.split(delimiter);
        Integer result = 0;

        Integer temp;
        for(int i = 0; i < tab.length; i++) {
            tab[i] = tab[i].trim();
            temp = Integer.parseInt(tab[i]);
            if (temp < 0) {
                throw new UnsupportedOperationException();
            }
            if (temp > 1000) {
                continue;
            }
            result += temp;
        }

        return result;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }
}
