package com.company.sda.leader;

import java.util.Arrays;
import java.util.HashMap;

public class Dominator {

    public static void main(String[] args) {
        int[] array = {3,4,3,2,3,-1,3,3};
        System.out.println(solutionDominator(array));

    }

    public static int solutionDominator (int[] a) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.length ; i++) {
            if (map.containsKey(a[i])){
                if (map.get(a[i]) >= a.length/2) {
                    return i;
                }
             else {
                map.put(a[i], map.get(a[i])+1);
            }
        } else{
                map.put(a[i], 1);
            }
        }
    return -1;
}}
