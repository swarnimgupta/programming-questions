package io.sam.learning.hackerrank;

import java.util.Scanner;

public class RunningTimeAndComplexityPrimeOrNot {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            int n = scanner.nextInt ( );
            RunningTimeAndComplexityPrimeOrNot primeOrNot = new RunningTimeAndComplexityPrimeOrNot ( );
            for (int i = 0; i < n; i++) {
                primeOrNot.checkPrime (scanner.nextInt ( ));
            }
        } catch (Exception e) {
            System.out.println (e);
        }
    }

    private void checkPrime(int number) {
        if (number == 1) {
            System.out.println ("Not Prime");
        } else {
            boolean prime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.println ("Prime");
            else {
                System.out.println ("Not Prime");
            }
        }
    }
}