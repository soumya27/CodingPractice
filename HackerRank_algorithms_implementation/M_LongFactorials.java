package HackerRank_algorithms_implementation;

import java.math.BigInteger;

public class M_LongFactorials {

    static void extraLongFactorials(int n) {
        BigInteger fact = BigInteger.valueOf(1);
        for(int i = n ; i > 0; i--){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        extraLongFactorials(25);
    }
}
