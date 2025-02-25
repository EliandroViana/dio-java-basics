package edu.eliandro.conditionals;

import java.util.Locale;

public class ternaryConditional {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int nota = 5;
        String result = nota >= 7 ? "Approved" : nota >=5 && nota < 7 ? "Recuperation" : "Reproved";

        System.out.println(result);
    }
}
