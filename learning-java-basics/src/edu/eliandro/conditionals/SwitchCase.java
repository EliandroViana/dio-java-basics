package edu.eliandro.conditionals;

import java.util.Locale;

public class SwitchCase {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String sigla = "P"; //P, M ou G;

        switch (sigla) {
            case "P": {
                System.out.println("Pequeno");
                break;
            }
            case "M": {
                System.out.println("Medio");
                break;
            }
            case "G": {
                System.out.println("Grande");
                break;
            }
            default: System.out.println("Invalido");
        }
    }
}
