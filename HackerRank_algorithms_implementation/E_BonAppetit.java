//Link:https://www.hackerrank.com/challenges/bon-appetit/problem
package HackerRank_algorithms_implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E_BonAppetit {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum =0;
        for (Integer item : bill)
            sum+=item;
        sum = sum - bill.get(k);
        int dif = b -(sum)/2;
        if(dif != 0)
            System.out.println(dif);
        else
            System.out.println("Bon Appetit");
    }

    public static void main(String[] args) {
        List<Integer> bill = new ArrayList<>(Arrays.asList(
           3,10,2,9
        ));
        int k =1;
        int b =12;
        bonAppetit(bill,k,b);
    }
}
