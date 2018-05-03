package com.company.sda.prefixsums;

import java.util.ArrayList;
import java.util.List;

public class CountDiv {

    public static void main(String[] args) {
        System.out.println(solutionCountDiv(6,11,2));

    }

    public static int solutionCountDiv (int a, int b, int k) {
        int [] elements = new int[b-a];
        List<Integer> divisible = new ArrayList<>();

        for (int i = 0; i < elements.length ; i++) {
            elements[i] = a++;

            if (elements[i] % k == 0){
                divisible.add(elements[i]);
            }
        }
        return divisible.size();
    }
}
