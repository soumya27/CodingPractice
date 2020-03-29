//Link:https://leetcode.com/contest/weekly-contest-181/problems/create-target-array-in-the-given-order/
package leetCode.contest;

import java.util.ArrayList;

public class E_Weekly5364 {

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0 ; i < index.length; i ++){
            result.add(index[i], nums[i]);
        }
        int[] resultArray = new int[result.size()];
        for( int i = 0 ; i < result.size(); i++)
            resultArray[i] = result.get(i);
        return resultArray;
    }

    public static void main(String[] args) {
        createTargetArray(new int[]{0,1,2,3,4}, new int[]{0,1,2,2,1});
    }
}
