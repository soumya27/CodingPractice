//Link:https://leetcode.com/problems/search-in-rotated-sorted-array/
package leetCode.Medium;

public class M_Leetcode33 {


    public static int binarySearch(int[] nums, int l, int r, int key){
        if (r >= l){
            int mid = l + (r-l)/2 ;
            if (nums[mid]==key)
                return mid;
            else if( nums[l]>nums[r]){ //sorted is on the right
                if (key> Math.min(nums[l],nums[mid]) && key< Math.max(nums[l],nums[mid])){
                    return binarySearch(nums,l,mid-1,key);
                }else{
                    return binarySearch(nums, mid + 1, r, key);
                }
            }else {
                if( key < nums[mid]){
                    return binarySearch(nums,l,mid-1,key);
                }else {
                    return binarySearch(nums, mid + 1, r, key);
                }
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0 ,nums.length-1,target);
    }

    public static void main(String[] args) {
        int[] input = new int[]{4,5,6,7,0,1,2};
        int target = 0 ;
        System.out.println(search(input,target));
        input = new int[]{5,1,3};
        target = 3;
        System.out.println(search(input,target));
//        input = new int[]{3,5,1};
//        System.out.println(search(input,target));
////
//        input = new int[]{4,5,6,7,8,1,2,3};
//        target = 8;
//        System.out.println(search(input,target));
//        input = new int[] {3,1};
//        target = 1;
//        System.out.println(search(input,target));
//
//        input = new int[]{1,2,3,4,5,6,7,8};
//        target = 8;
//        System.out.println(search(input,target));
    }
}
