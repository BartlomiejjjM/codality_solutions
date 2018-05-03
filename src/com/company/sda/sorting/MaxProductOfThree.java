package com.company.sda.sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    public static void main(String[] args) {
        int[] array = {-3,1,2,-2,5,6};

        System.out.println(solutionMaxProductOfThree(array));
    }

    public static int solutionMaxProductOfThree (int[] a){

        int result = 0;
        Arrays.sort(a);

        result = a[a.length-1] * a[a.length-2] * a[a.length-3];

        return result;




    }
}
