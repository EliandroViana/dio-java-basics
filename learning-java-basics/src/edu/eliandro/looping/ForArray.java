package edu.eliandro.looping;

public class ForArray {
    public static void main(String[] args) {

        // Index of array:               0      1           2           3
        String[] fruits = new String[]{"uva", "morango", "abacaxi", "limão"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Index: " + i + " = Fruit: " + fruits[i]);
        }

        String[] alunos = {"Foo", "Bar", "John", "Doe", "Emily", "Doydle"};

        for (String aluno : alunos) {
            System.out.printf("Name: %s\n", aluno);
        }
    }
}
