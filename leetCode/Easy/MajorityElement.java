//Link:https://leetcode.com/problems/majority-element/
package leetCode.Easy;

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer> countNumber = new HashMap<>();
        int majority = nums.length /2;
        for(int number : nums){
            if(countNumber.containsKey(number)){
                countNumber.put(number,countNumber.get(number)+1);
            }
            else {
                countNumber.put(number,1);
            }
            if(countNumber.get(number)>majority)
                return number;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1}));
    }
}
