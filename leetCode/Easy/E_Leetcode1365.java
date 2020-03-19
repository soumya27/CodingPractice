//Link:https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
package leetCode.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class E_Leetcode1365 {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        List<Integer> sortedInput = IntStream.of(nums)
                .boxed().collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(sortedInput);
        for (int i = 0 ; i <nums.length; i++){
            int value = sortedInput.indexOf(nums[i]);
            nums[i]= value;
        }
        return nums;
    }
    public static void main(String[] args) {
//        int[] input = new int[]{8,1,2,2,3};
        int[] input = new int[] {6,5,4,8};
        for (int value: smallerNumbersThanCurrent(input)){
            System.out.println(value);
        }
    }
}
