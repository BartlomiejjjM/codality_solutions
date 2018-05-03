package com.company.sda.primeandcompositenumbers;

import java.util.HashSet;

public class MinPerimeterRectangle {

    public static void main(String[] args) {
        System.out.println(solutionMinPerimeterRectangle(24));
    }

    public static int solutionMinPerimeterRectangle(int n) {

        int min = n + 1;
        int sqrtArea = (int) Math.sqrt(n);

        for (int a = 1; a <= sqrtArea; a++) {
            if (n % a == 0) {
                int b = n / a;
                if (a + b < min) {
                    min = a + b;
                }
            }
        }

        return 2 * min;
    }
}
