package edu.eliandro.looping;

import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {

        double salary = 50.0;

        while(salary > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > salary)
                valorDoce = salary;
            
            System.out.printf("Valor do doce: %.2f Adicionado no carrinho\n", valorDoce);
            salary = salary - valorDoce;
        }
        System.out.println("Salário insuficiênte: " + salary);
        System.out.println("John gastou todo seu salário em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 15);
    }
}
