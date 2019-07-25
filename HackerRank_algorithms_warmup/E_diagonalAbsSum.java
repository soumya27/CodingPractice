//Link: https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
package HackerRank_algorithms_warmup;

 import java.util.*;

 public class E_diagonalAbsSum {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int LRSum=0, RLSum=0;
        int size = arr.size();
        int LRs=0, RLi=0 ,RLj=size-1;

        while(--size >= 0){
            LRSum+=arr.get(LRs).get(LRs);
            LRs++;
            RLSum+=arr.get(RLi).get(RLj);
            RLi++;
            RLj--;
        }

        System.out.println("RLSum :"+RLSum);
        System.out.println("LRSum :"+LRSum);
        return Math.abs(RLSum-LRSum);
    }

}































