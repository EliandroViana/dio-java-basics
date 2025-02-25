package edu.eliandro.looping;

public class BreakContinue {
    public static void main(String[] args) {

        for (int num = 1; num <= 5; num++) {
            if (num == 3)
                continue; // break will stop, and "continue" will the iteration loop, but without num equals 3; e.g 1 2 4 5.

            System.out.println(num);
        }
    }
}
