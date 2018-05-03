package com.company.sda.timecomplexity;

public class FrogJump {

    public static void main(String[] args) {
        System.out.println(solutionFrogJump(10,85,40));

    }

    public static int solutionFrogJump (int x, int y, int d) {

        int distance = y-x;
        int numberOfJumps = 0;

        if (distance % d == 0) {
            numberOfJumps = distance/d;
        }
        if (distance % d != 0) {
            numberOfJumps = (distance/d) +1;
        }
        return numberOfJumps;
    }

}
