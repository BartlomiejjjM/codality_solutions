package com.company.sda.maximumsliceproblem;

public class MaxProfit {

    public static void main(String[] args) {

        int[] array = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(solutionMaxProfit(array));
    }

    public static int solutionMaxProfit (int[] a) {
        int maxEnding = 0;
        int maxProfit = 0;
        int minPrice = a[0];

        for (int i = 1; i < a.length ; i++) {
            maxEnding = Math.max(0, a[i] -minPrice);
            minPrice = Math.min(minPrice, a[i]);
            maxProfit = Math.max(maxEnding, maxProfit);
        }
        return maxProfit;
    }
}
