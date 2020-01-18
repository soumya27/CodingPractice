//Link:https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
package HackerRank_algorithms_implementation;

import java.util.ArrayList;
import java.util.List;

public class M_ClimbingLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] result = new int[alice.length];

//        for( int n : alice) {
//            System.out.println(binarySearch(scores, 0, scores.length, n));
//        }

        List<Integer> scoreLists = new ArrayList<>();
        for (int score : scores){
            if(!scoreLists.contains(score)){
                scoreLists.add(score);
            }
        }
        for (int i = alice.length-1; i>= 0 ; i--){
            if( alice[i] >= scoreLists.get(0))
                result[i]= 1;
            else if ( alice[i]< scoreLists.get(scoreLists.size()-1))
                result[i] = scoreLists.size()+1;
            else
                result[i] = binarySearch(scoreLists,0,scoreLists.size()-1, alice[i]) +1;
        }
        return result;
    }

    static int binarySearch(List<Integer> arr, int l, int h, int key)
    {
        if (h >= l) {
            int mid = (l + h )/ 2;
            if( arr.get(mid)==key){
                return mid;
            }
            if(l == mid || h == mid){
                if(key <  arr.get(mid)  && key >  arr.get(h))
                    return  mid+1;
                else if (key <  arr.get(mid)  && key <  arr.get(h))
                    return h +1;
                else if (key >  arr.get(mid) && key >  arr.get(l))
                    return l;
                else
                    return mid+1;
            }
            if ( arr.get(mid) < key )
                return binarySearch(arr, l, mid - 1, key);

            return binarySearch(arr, mid + 1, h, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] scores = new int[]{100,50,40,20,10};
        int[] alice = new int[]{5,25,50,120};

        int[] result = climbingLeaderboard(scores,alice);
        for (int output: result){
            System.out.print(output+ " ");
        }
    }
}
