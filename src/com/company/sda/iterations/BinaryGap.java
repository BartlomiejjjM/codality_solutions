package com.company.sda.iterations;

public class BinaryGap {

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        System.out.println(binaryGap.solution(1));
    }

    public int solution( int n) {

        int longestgap=0;
        int currentgap=0;



        String binaryRepresentation = Integer.toBinaryString(n);

        for (int i = 0; i+1 < binaryRepresentation.length() ; i++) {
            if (currentgap == 0) {
                if (binaryRepresentation.charAt(i) == '1' && binaryRepresentation.charAt(i+1) == '0'){
                    currentgap++;
                }
            } else {
                if (binaryRepresentation.charAt(i+1) == '0'){
                    currentgap++;
                }
                if (binaryRepresentation.charAt(i+1) == '1') {
                    if (currentgap > longestgap){
                        longestgap = currentgap;
                    }
                    currentgap = 0;
                }
            }

        }
        return longestgap;
    }

}
