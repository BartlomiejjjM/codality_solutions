package com.company.sda.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OddOccurenciesInArray {

    public static void main(String[] args) {
        int[] array = {9,3,9,3,9,7,9,4,13};
        if (array.length %2 == 0){
            throw new IllegalArgumentException("Array should have odd number of elements");
        }
        System.out.println(solutionOccurences(array));
    }



    public static int solutionOccurences(int[] a) {

        HashMap <Integer, Integer> occurences = new HashMap<>();

        for (int element: a
             ) {
            if (occurences.containsKey(element)){
                occurences.remove(element);
            }else {
                occurences.put(element,1);
            }
        }

        List<Integer> oddElement = new ArrayList<>(occurences.keySet());
        if (oddElement.size()>1){
            throw new IllegalArgumentException("Only one element of array should be unpaired");
        }
        return oddElement.get(0);
}}
