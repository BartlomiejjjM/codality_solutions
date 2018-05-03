package com.company.sda.prefixsums;

public class PassingCars {

    public static void main(String[] args) {

        int[] array = {0,1,0,1,1};
        System.out.println(solutionPassingCars(array));

    }

    public static int solutionPassingCars (int[] a) {
        int result = 0;
        int ones = 0;

        for (int i = a.length-1; i >=0 ; i--) {
            if (a[i] == 1){
                ones++;
            }else {
                result = result + ones;
                if (result > 1000000){
                    return -1;
                }
            }
        }
        return result;
    }
}
