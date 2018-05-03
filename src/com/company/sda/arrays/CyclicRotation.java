package com.company.sda.arrays;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] array = {3, 8, 9, 7, 6};
        int[] result = solutionCyclic(array, 1);

        System.out.println(Arrays.toString(result));
    }

    public static int[] solutionCyclic(int[] a, int k) {

        int rotation = k-1;
        int[] copy = new int[a.length];
        System.arraycopy(a,0,copy,0,a.length);
        int newIndex;
        for (int i = 1; i < a.length+1 ; i++) {

            newIndex = (i+rotation) % a.length;
            a[newIndex] = copy[i-1];
        }
        return a;
    }
}
