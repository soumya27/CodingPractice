//Link:https://www.hackerrank.com/challenges/closest-numbers/problem
package HackerRank_algorithms_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class E_ClosetNumber {

    private static void sort(int[] array) {
        for(int i = 1 ; i < array.length; i++){
            int key = array[i];
            int j = i-1;
            while( j>=0 && array[j]>key){
                array[j+1]= array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    private static int[] closestNumbers(int[] arr) {
        // Sort array using insertion sort
        sort(arr);
        // find the min of the array
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> values = new ArrayList<>();
        for(int i = arr.length-1 ; i>0 ; i--){
            if( arr[i]-arr[i-1] < min){
                min = arr[i]-arr[i-1];
            }
        }
        // find pairs with min and sort
        for(int i = arr.length-1 ; i>0 ; i--){
            if( arr[i]-arr[i-1] == min){
                values.add(arr[i]);
                values.add(arr[i-1]);
            }
        }
        Collections.sort(values);
        return values.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-20,-3916237, -357920, -3620601 ,7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470 };
        System.out.println(Arrays.toString(closestNumbers(arr)));
    }
}
