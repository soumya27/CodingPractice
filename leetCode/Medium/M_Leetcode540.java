//Link:https://leetcode.com/problems/single-element-in-a-sorted-array/
package leetCode.Medium;

public class M_Leetcode540 {

    public static int partition(int[] nums, int start, int end){
        if (end == start){
            return nums[start];
        }else if ( end -start ==1 || end <start){
            return -1;
        }
        else {
            int mid = ( start + end) /2;
            if (mid+1 <= end && nums[mid] == nums[mid+1]){
                int result =partition(nums, mid+2, end);
                 if (result== -1)
                    return partition( nums,start,mid-1);
                 else
                     return result;
            }
            else if (mid-1>=start && nums[mid] == nums[mid-1]){
                int result = partition(nums, start, mid-2);
                if (result == -1)
                    return  partition( nums,mid+1,end);
                else
                    return result;
            }
            else {
                return nums[mid];
            }
        }
    }

    public static int singleNonDuplicate(int[] nums) {
       return partition(nums, 0 , nums.length-1);
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,1,2,3,3,4,4,8,8};
//        System.out.println(singleNonDuplicate(new int[]{2}));
        System.out.println(singleNonDuplicate(input));
        input = new int[] {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(input));
    }
}
