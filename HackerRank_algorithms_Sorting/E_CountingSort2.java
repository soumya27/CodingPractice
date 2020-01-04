package HackerRank_algorithms_Sorting;

import java.util.Arrays;

public class E_CountingSort2 {

    private static int[] countingSort(int[] arr) {
        int[] result = new int[100];
        int[] sortedArr = new int[arr.length];
        // find occurrence
        for (int value : arr) {
            result[value]++;
        }
        //modify the array - prefix array
        for(int i =1; i <result.length; i++){
            result[i] += result[i-1];
        }
        //output array
        for (int value : arr) {
            int index = result[value];
            sortedArr[index - 1] = value;
            result[value]--;
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        int[] array = new int[]{12,3,4,99,20,10,4};
        System.out.println(Arrays.toString(countingSort(array)));
    }
}
