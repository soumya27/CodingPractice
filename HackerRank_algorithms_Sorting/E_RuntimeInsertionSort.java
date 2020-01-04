//Link: https://www.hackerrank.com/challenges/runningtime/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
package HackerRank_algorithms_Sorting;

import java.util.Arrays;

public class E_RuntimeInsertionSort {

    static int runningTime(int[] arr) {
        int count=0;
        for(int i =1; i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
                count++;
            }
            arr[j+1]= key;
        }
//        System.out.println(Arrays.toString(arr));
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,1,3,1,2};
        System.out.println(runningTime(arr));
    }
}
