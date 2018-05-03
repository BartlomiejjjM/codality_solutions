package com.company.sda.sorting;

import java.util.Arrays;

public class Triangle {

    public static void main(String[] args) {
        int[] array = {10,50,5,1};

        System.out.println(solutionTriangle(array));
    }

    public static int solutionTriangle (int[] a) {
        Arrays.sort(a);

        for (int i = 0; i <a.length-2 ; i++) {
            if (    a[i] + a[i+1] > a[i+2] &&
                    a[i+1] + a[i+2] > a[1] &&
                    a[i+2] + a[i] > a[i+1] ) {
                return 1;
            }
            }
        return 0;
        }

    }

