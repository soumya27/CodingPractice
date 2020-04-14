package leetCode.Easy;
//link:https://leetcode.com/problems/two-sum/
import java.util.HashMap;

public class E_Leetcode1 {
    public static int[] twoSum(int[] nums, int target) {
//        Method 1
//        int[] result = new int[2];
//        int[] sumNums = new int[nums.length];
//        for(int i =0 ;i<nums.length;i++){
//            sumNums[i] = target -nums[i];
//        }
//        for(int i = 0;i<nums.length;i++){
//            for(int j =i+1;j<nums.length;j++){
//                if(sumNums[i]==nums[j]) {
//                    result[0]=i;
//                    result[1]=j;
//                    return result;
//                }
//            }
//        }
//        return result;

//        Method 2
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i =0 ;i <nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff) && map.get(diff)!= i){
                return new int[] {i,map.get(diff)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int result[] = twoSum(new int[] {-1,-2,-3,-4,-5},-8);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
