package edu.eliandro.looping;

import java.util.Random;

public class DoWhile {

    public static void main(String[] args) {

        System.out.println("Discando...");

        do {
            // exec until someone answer the phone
            System.out.println("Telefone tocando!");
        } while (playing());

        System.out.println("Alô !!!");
    }

    private static boolean playing() {
        boolean answerThePhone = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + answerThePhone);
        // don't hangout
        return !answerThePhone;
    }
}
