//Link:https://leetcode.com/problems/single-number/
package leetCode.Easy;

import java.util.Arrays;

public class E_Leetcode136 {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 1 ; i < nums.length ;i+=2){
            if (nums[i]!= nums[i-1])
                return nums[i-1];
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,3,4,4}));
    }
}
