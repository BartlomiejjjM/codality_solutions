package com.company.sda.primeandcompositenumbers;

import java.util.HashSet;

public class CountFactors {

    public static void main(String[] args) {

        System.out.println(solutionCountFactors(8));
    }

    public static int solutionCountFactors ( int n) {

        HashSet <Integer> factors = new HashSet<>();

        for (int i = 1; i <= n ; i++) {
            if (n % i == 0){
                factors.add(i);
            }
        }
        return factors.size();
    }
}
