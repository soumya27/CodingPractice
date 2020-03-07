//Link: https://leetcode.com/problems/subarray-sum-equals-k/
package leetCode.Medium;

import java.util.Arrays;

public class M_Leetcode560 {

    public int subarraySum(int[] nums, int k ){
        int[] prefix = new int[nums.length+1];
        int count=0;
        prefix[0]= 0;
        for (int i = 1; i<=nums.length ; i ++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        System.out.println(Arrays.toString(prefix));
        for (int start = 0 ; start < nums.length; start++){
            for (int j = start+1 ; j <= nums.length; j++){
                if(prefix[j]- prefix[start] == k)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1};
        int k =2;
        System.out.println(new M_Leetcode560().subarraySum(nums,k));
    }
}
