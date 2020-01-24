//Link : https://www.hackerrank.com/challenges/non-divisible-subset/problem
package HackerRank_algorithms_implementation;

import java.util.ArrayList;
import java.util.List;

public class M_NonDivisibleSubset {
    /*
    * Complete the 'nonDivisibleSubset' function below.
    *
    * The function is expected to return an INTEGER.
    * The function accepts following parameters:
    *  1. INTEGER k
    *  2. INTEGER_ARRAY s
    */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        int[] reminderList = new int[k];
        for(int value : s ){
            reminderList[value%k]+=1;
        }
        if (k % 2 == 0)
            reminderList[k/2] = Math.min(reminderList[k/2], 1);

        int res = Math.min(reminderList[0], 1);

        for (int i = 1; i <= k/2; i++)
            res += Math.max(reminderList[i], reminderList[k-i]);

        return res;
    }

    public static void main(String[] args) {
        int k =4;
        List<Integer> input = new ArrayList<>();
        input.add(19);
        input.add(10);
        input.add(12);
        input.add(10);
        input.add(24);
        input.add(25);
        input.add(22);

        System.out.println(nonDivisibleSubset(k,input));
    }
}
