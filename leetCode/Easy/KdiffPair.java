//Link:https://leetcode.com/problems/k-diff-pairs-in-an-array/
package leetCode.Easy;

import java.util.*;

public class KdiffPair {

    public int findPairs(int[] nums, int k) {
        if(nums==null||k<0){
            return 0;
        }
        ArrayList<Integer> numbers = new ArrayList<>();
        Set<Set<Integer>> result = new HashSet<>() ;

        for (int num : nums) numbers.add(num);

        for(int i = 0 ; i<numbers.size();i++){
            int negative =k+nums[i];
            int positive = nums[i]-k;
            addToSet(positive,numbers,i,nums,result);
            addToSet(negative,numbers,i,nums,result);
        }
        return result.size();
    }

    public void addToSet(int number,ArrayList<Integer> numbers,int i,int[] nums,Set<Set<Integer>> result){
        if(numbers.subList(i+1,numbers.size()).contains(number)){
            result.add(new HashSet<Integer>(){{
                add(nums[i]);
                add(number);
            }});
        }
    }

    public static void main(String[] args) {
        KdiffPair kdiffPair = new KdiffPair();
        System.out.println(kdiffPair.findPairs(new int[]{3, 1, 4, 1, 5},1));
    }
}
