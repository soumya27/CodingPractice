//Link:https://leetcode.com/problems/find-lucky-integer-in-an-array/
package leetCode.contest;

import java.util.HashMap;

public class E_Weekly1394 {
    public static int findLucky(int[] arr) {
        int result = -1 ;
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for ( int value : arr){
            frequency.merge(value, 1, Integer::sum);
        }
        for (int key :frequency.keySet()){
            if (key == frequency.get(key) )
                result = key;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findLucky (new int[]{ 1,2,2,3,3,3}));
    }
}
