package edu.eliandro.operators;

public class AllOperators {

    public static void main(String[] args) {

        // Basic Operators
        // assignment operator: =
        // arithmetic operators: +, -, *, /, %
        // relational operators: ==, !=, > , < , >= , <=
        // logical operators: &&, ||, !
        // bitwise operators: &, |, ^, ~, <<, >>
        // increment/decrement operators: ++, --
        // ternary operator: ? :
        // type casting: (type) expression
        // String concatenation: "String1" + "String2"

        // declare int = 5;
        int num = 5;
        System.out.println(num);
        // turn the numb negative
        num = -num;
        System.out.println(num);
        // return the positive way of the number = -5
        num = num * -1;
        System.out.println(num);
        // increment the numb = +1
        num++;
        System.out.println(num);
        // decrement the numb = -1
        num--;
        System.out.println(num);

        // inverting the value of boolean
        boolean var = true;
        System.out.println("invert: " + !var);
        System.out.println("the real value: " + var);
        // new atribution to the boolean variable, now we're saying she is false.
        var = !var;
        System.out.println("With new value: " + var);

        // conditional structure with if else
        int a, b;

        a = 10;
        b = 10;

        String result;

        if (a == b) {
            result = "true";
        } else
            result = "false";

        System.out.println("Resultado: " + result);

        int resultWithTernary = a == b ? 1 : 0;
        System.out.printf("%d\n", resultWithTernary);

        if (a >= b) {
            System.out.println("So this is True");
        } else
            System.out.println("So this is False");

        // Stack vs Heap
        // var name1 declared in stack
        String name1 = "Foo";
        // var name2 declared in Heap
        String name2 = new String("Foo");

        String resultName = name1.concat(name2);
        boolean condition = name1 == name2;
        System.out.printf("Is equal?: %s\n", condition);
        System.out.println("The object is equals?: " + name1.equals(name2));
        System.out.printf("Result name: %s\n", resultName);

        boolean condition1 = true;
        boolean condition2 = false;

        if (condition1 && condition2) {
            System.out.println("They are true!");
        }
        System.out.println("The end");

        if (condition1 || condition2) {
            System.out.println("If one of both is true, this is true!");
        } else
            System.out.println("The end");

        if (condition1 && (7 > 4)) {
            System.out.println("They are true!");
        }
    }
}
