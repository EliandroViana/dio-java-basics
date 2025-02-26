package edu.eliandro.debugging;

public class stackExecution {

    public static void main(String[] args) {

        System.out.println("Main init the program!");
        methodA();

        System.out.println();
        System.out.println("The end, after exec all the methods calls!");
    }

    static void methodA() {

        System.out.println();
        System.out.println("This is the method A result!");

        String[] fruits = new String[]{"morango", "uva", "laranja"};

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        methodB();
        System.out.println("Finishing the method A!");
    }

    static void methodB() {

        System.out.println();
        System.out.println("This is the method B result!");
        for (int i = 0; i < 3; i++) System.out.println(i);

        methodC();
        System.out.println("Finishing the method B!");
    }

    static void methodC() {

        System.out.println();
        System.out.println("This is the method C result!");
        Thread.dumpStack(); // force the exception; Stack Trace

        int i = 0;
        while (i < 3){
            System.out.println("Index: " + i);
            i++;
        }

        System.out.println();
        System.out.println("Finishing the method C!");
    }
}
