package com.company.sda.maximumsliceproblem;

public class MaxSliceSum {

    public static void main(String[] args) {
        int[] array = {3,2,-6,4,0};
        System.out.println(solutionMaxSliceSum(array));
    }

    public static int solutionMaxSliceSum (int[] a) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length ; i++) {
           max = a[i] > max ? a[i] : max;
        }
        if (max <= 0){
                return max;
        }

        int maxSliceSum = 0;
        int currentSum = 0;

        for (int i = 0; i < a.length ; i++) {
           currentSum = (currentSum+a[i])>0 ? (currentSum+a[i]):0;
           maxSliceSum = currentSum > maxSliceSum ? currentSum:maxSliceSum;
        }
        return maxSliceSum;
    }
}
