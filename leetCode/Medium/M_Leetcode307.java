//Link:https://leetcode.com/problems/range-sum-query-mutable/
package leetCode.Medium;

public class M_Leetcode307 {
    static class NumArray {

        int[] nums;
        int[] prefix;

        public NumArray(int[] nums) {
            this.nums = new int[nums.length];
            this.prefix = new int[nums.length];
            for( int i =0 ;i < nums.length; i++){
                this.nums[i]= nums[i];
                if( i!=0)
                    this.prefix[i] = prefix[i-1]+nums[i];
                else
                    this.prefix[i] = nums[i];
            }
        }

        public void update(int i, int val) {
            int diff =  nums[i]-val;
            nums[i] = val;
            for (int index = i ;index< nums.length; index++){
                prefix[index] -= diff;
            }
        }

        public int sumRange(int i, int j) {
            if( i ==0)
                return prefix[j];
            else
                return prefix[j]- prefix[i-1];
        }
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{1,3,5});
        System.out.println(numArray.sumRange(0,2));
        numArray.update(1,2);
        System.out.println(numArray.sumRange(0,2));
    }
}
