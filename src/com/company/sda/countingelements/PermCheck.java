package com.company.sda.countingelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PermCheck {
        //permutacja
    public static void main(String[] args) {
        int[] array = {4,1,3};
        System.out.println(solutionPermCheck(array));

    }

    public static int solutionPermCheck(int[] a) {

        Arrays.sort(a);

        for (int i = 0; i < a.length ; i++) {
            if (a[i] != i){
                return 0;
            }
        }
        return 1;
    }

}
