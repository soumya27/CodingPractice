//Link: https://www.hackerrank.com/challenges/countingsort1/problem
package HackerRank_algorithms_Sorting;

import java.util.Arrays;

public class E_CountingSort1 {

    static int[] countingSort(int[] arr) {
        int[] result = new int[101];
        for (int value : arr) {
            result[value]++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{12,3,4,82,20,10,4};
        System.out.println(Arrays.toString(countingSort(array)));
    }
}
