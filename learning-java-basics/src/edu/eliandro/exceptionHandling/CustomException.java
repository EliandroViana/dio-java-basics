package edu.eliandro.exceptionHandling;

import java.text.NumberFormat;
import java.text.ParseException;

public class CustomException {
    public static void main(String[] args) {

        Number value;

        try {
            value = NumberFormat.getInstance().parse("a1.75");
            System.out.println(value);

        } catch (ParseException err) {
            err.printStackTrace();
        }
    }
}
