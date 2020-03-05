//Link:https://leetcode.com/problems/contains-duplicate-ii/
package leetCode.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class E_Leetcode219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, List<Integer>> inputDetails = new HashMap<>();
        for(int i = 0 ; i <nums.length; i++){
            int n = nums[i];
            if(inputDetails.get(n) != null){
                inputDetails.get(n).add(i);
                for(int j = 0; j<inputDetails.get(n).size()-1; j++){
                    if(Math.abs(inputDetails.get(n).get(j)- inputDetails.get(n).get(j+1)) <= k) {
                        return true;
                    }
                }
            }else{
                List<Integer> numList = new ArrayList<>();
                numList.add(i);
                inputDetails.put(n,numList);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] input = new int[] {1,0,1,1};
        int k = 1;
        System.out.println(new E_Leetcode219().containsNearbyDuplicate(input,k));
    }
}
