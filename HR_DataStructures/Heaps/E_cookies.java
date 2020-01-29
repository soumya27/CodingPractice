//Link:https://www.hackerrank.com/challenges/jesse-and-cookies/problem
package HR_DataStructures.Heaps;

import java.util.PriorityQueue;

public class E_cookies {

    static int cookies(int k, int[] A) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int value : A){
            queue.add(value);
        }
        int count = 0 ;

        while (queue.size()>1 && queue.peek()<k){
            int least = queue.poll();
            int secondleast = queue.poll();

            queue.add ( least+ (2* secondleast));
            count++;
        }

        if (queue.peek() > k ){
            return count;
        }
       return -1;
    }

    public static void main(String[] args) {
        int k =7 ;
        int[] inputs = new int[]{1, 2, 3, 9, 10, 12};

        System.out.println(cookies(k,inputs));
    }

}
