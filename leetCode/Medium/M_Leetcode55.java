//Link: https://leetcode.com/problems/jump-game/
package leetCode.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class M_Leetcode55 {

    public boolean canJump(int[] nums) {
        int goal = nums.length-1;
        int[] visited = new int[goal+1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0]=1;
        while (! queue.isEmpty()){
            int index = queue.poll();
            if( index == goal) // exit condition
                return true;
            // add all possible values to queue
            for( int i =0; i<= nums[index] ; i++){
//                if(i < goal) {
                    if (i <= goal && i+index <= goal && visited[i + index] != 1) {
                        queue.add(i + index);
                        visited[i + index] = 1;
                    }
//                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3};
        System.out.println(new M_Leetcode55().canJump(nums));
    }
}
