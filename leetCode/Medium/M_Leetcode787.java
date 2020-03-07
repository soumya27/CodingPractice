//Link: https://leetcode.com/problems/cheapest-flights-within-k-stops/
package leetCode.Medium;

import java.util.PriorityQueue;

public class M_Leetcode787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[][] matrix = new int[n][n];
        for (int[] flight : flights){
            matrix[flight[0]][flight[1]] = flight[2];
        }

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a,b)-> Integer.compare(a[0],b[0]));
        priorityQueue.offer(new int[]{0,src,K+1});

        while(!priorityQueue.isEmpty()){
            int[] edge = priorityQueue.poll();
            int price = edge[0], place = edge[1], remaining = edge[2];
            if( place == dst)
                return price;

            if (remaining>0){
                for(int i = 0 ; i < n ; i++){
                    if(matrix[place][i] > 0 ){
                        priorityQueue.offer(new int[] { price+matrix[place][i],i, remaining-1});
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] flights = new int[][]{
                {0,1,100},{1,2,100},{0,2,500}
        };
        int n = 3;
        int src = 0, dst = 2, k =0;

        System.out.println(new M_Leetcode787().findCheapestPrice(n,flights,src,dst,k));
    }
}
