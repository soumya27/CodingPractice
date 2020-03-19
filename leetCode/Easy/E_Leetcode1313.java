//Link:https://leetcode.com/problems/decompress-run-length-encoded-list/
package leetCode.Easy;

import java.util.Arrays;

public class E_Leetcode1313 {
    public static int[] decompressRLElist(int[] nums) {
        int n =0 ;
        for( int i = 0; i <nums.length; i++){
            if((2*i+1)<nums.length)
                n += nums[2*i];
        }
        System.out.println(n);
        int[] result = new int[n];
        int pos = 0;
        for (int x = 0; x < nums.length; x += 2) {
            int val = nums[x + 1];
            Arrays.fill(result, pos, pos + nums[x], val);
            pos += nums[x];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4};
        for(int value: decompressRLElist(input)){
            System.out.println(value);
        }
    }
}
