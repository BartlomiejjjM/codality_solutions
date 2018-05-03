package com.company.sda.timecomplexity;

import java.util.HashSet;

public class PermMissingElem {

    public static void main(String[] args) {
        int[] input = {2,3,1,4};
        System.out.println(solutionPermMissing(input));

    }

    public static int solutionPermMissing (int[] a) {

        HashSet <Integer> arrayElements = new HashSet<>();

        for (int element: a
             ) {
            arrayElements.add(element);
        }

        int count = 1;

        while (arrayElements.contains(count)){
            count++;
        }
        return count;
    }
}
