package com.company.sda.sorting;

import java.util.HashSet;

public class Distinct {

    public static void main(String[] args) {
        int[] array = {2,1,1,2,3,1,4,17};

        System.out.println(solutionDistinct(array));
    }

    public static int solutionDistinct (int[] a) {
        HashSet<Integer> elementsOfArray = new HashSet<>();

        for (int element: a
             ) {
            elementsOfArray.add(element);
        }
        return elementsOfArray.size();
    }
}
