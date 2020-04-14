package leetCode.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E_Leetcode1403 {

    public static List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        int newsum = 0;
        for (int i = nums.length-1;i>=0;i--){
            result.add(nums[i]);
            newsum += nums[i];
            if (newsum>sum - newsum)
                return result;
        }
        return  result;
    }

    public static void main(String[] args) {
        for (int number : minSubsequence(new int[]{4,4,7,6,7}))
            System.out.println(number);
    }
}
