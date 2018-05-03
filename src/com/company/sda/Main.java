package com.company.sda;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {3,8,9,7,6};
        int[] copy = new int[array.length];

        System.arraycopy(array,0,copy,0,array.length);

        System.out.println(Arrays.toString(copy));
        System.out.println(copy.length);
    }
}
