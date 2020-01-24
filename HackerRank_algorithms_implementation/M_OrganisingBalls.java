//Link: https://www.hackerrank.com/challenges/organizing-containers-of-balls/problem
package HackerRank_algorithms_implementation;

import java.util.Arrays;

public class M_OrganisingBalls {

    static String organizingContainers(int[][] container) {
        int[] a = new int[container.length];
        int[] b = new int[container.length];
        for (int i =0; i < container.length; i++){
            for( int j = 0; j< container.length; j++){
                a[i] += container[i][j];
                b[j] += container[i][j];
            }
        }
        //uses TimSort algorithm, giving us a time complexity of O(n log(n)).
        //TimSort makes use of the Insertion sort and the MergeSort algorithms.
        //in the worst case, its time complexity is O(n2).
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(b, a)){
           return "Possible";
        }
        return "Impossible";
    }


    public static void main(String[] args) {
        int[][] container = new int[][]{
                {1,3,1},{2,1,2},{3,3,3}
        };
        System.out.println(organizingContainers(container));
    }
}
