package leetCode.Medium;

import java.math.BigInteger;

public class M_Leetcode1404 {

    public static int numSteps(String s) {
        BigInteger number =new BigInteger(s, 2);
        System.out.println(number);
        return stepsToOne(number);
    }

    public static int stepsToOne(BigInteger number){
        int step = 0 ;
        while (!number.equals(BigInteger.ONE)) {
            if(number.testBit(0)) {
                number = number.add(BigInteger.ONE);
            } else {
                number = number.shiftRight(1);
            }
            step++;
        }
        return step;
    }

    public static void main(String[] args) {
        System.out.println(numSteps("1111110011101010110011100100101110010100101110111010111110110010"));
    }
}
