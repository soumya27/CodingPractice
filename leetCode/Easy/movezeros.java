package leetCode.Easy;


import java.util.Arrays;

public class movezeros {

    public static void moveZeroes(int[] nums) {
        int count=0;
        for (int number : nums){
            if (number ==0)
                count++;
        }
        for ( int i = 0 ; i < nums.length - count; ) {
            if (nums[i] == 0) {
                move(nums,i,nums.length);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void move( int[] nums, int start, int length){
        if (length - 1 - start >= 0) System.arraycopy(nums, start + 1, nums, start, length - 1 - start);
        nums[length-1]=0;
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,0,1});
    }
}
