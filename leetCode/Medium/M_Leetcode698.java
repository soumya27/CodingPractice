//Link: https://leetcode.com/problems/partition-to-k-equal-sum-subsets/
package leetCode.Medium;

import java.util.Arrays;

public class M_Leetcode698 {

    private boolean search (int[] groups, int row , int[] nums, int target){
        if( row < 0)
            return true;
        int v = nums[row--];
        for (int i = 0; i<groups.length;i++){
            if( groups[i]+v <= target){
                groups[i] += v;
                if( search (groups,row,nums,target)) return true;
                groups[i]-= v;
            }
            if (groups[i]==0) break;
        }
        return false;
    }

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum =0;
        for (int num : nums){
            sum += num;
        }
        if( sum %k > 0)
            return false;
        int target = sum/k;
        Arrays.sort(nums);

        int row = nums.length -1;
        if( nums[row] > target)
            return false;
        while (row>=0 &&nums[row] == target){
            row--;
            k--;
        }
        return search (new int[k], row, nums,target);
    }
}