package com.company.sda.countingelements;

public class FrogRiverOne {

    public static void main(String[] args) {
        int[] array = {1,3,1,4,2,3,5,4};
        int x = 5;

        System.out.println(solutionFrogRiver(array, x));

    }

    public static int solutionFrogRiver (int[] a, int x) {
        int temp = 0;

        boolean[] hasLeaf = new boolean[x+1];

        for (int i = 0; i < a.length ; i++) {
            if (!hasLeaf[a[i]] && a[i] <=x){
                hasLeaf[a[i]] = true;
                temp++;
            }
            if (temp == x){
                return i;
            }
        }
        return -1;
    }
}
