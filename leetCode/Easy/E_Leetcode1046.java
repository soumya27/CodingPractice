//Link:https://leetcode.com/problems/last-stone-weight/
package leetCode.Easy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class E_Leetcode1046 {

    public static int lastStoneWeight(int[] stones) {
        int result = 0 ;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int value : stones){
            queue.add(value);
        }
        while(queue.size()>1){
            int y = queue.poll();
            if (queue.size()>0) {
                int x = queue.poll();
                int diff = y-x;
                if (diff>0) {
                    queue.add(diff);
                }
            }
        }
        if (!queue.isEmpty())
            result = queue.poll();
        return result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{2,7,4,1,8,1};
        System.out.println(lastStoneWeight(input));
    }
}
