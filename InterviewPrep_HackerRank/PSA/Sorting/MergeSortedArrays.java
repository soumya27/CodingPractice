package InterviewPrep_HackerRank.PSA.Sorting;

import java.util.Arrays;

public class MergeSortedArrays {

    private static void merge(int[] array , int[] aux, int low, int mid , int hi){
//        low to mid-1 is sorted
//        mid+1 to hi is sorted
        System.arraycopy(array, 0, aux, 0, array.length);

        int  i=low, j = mid+1;
        for (int k = low; k <= hi; k++){
            if (i>mid)                  array[k] = aux[j++];
            else if ( j>hi)             array[k] = aux[i++];
            else if (aux[i] < aux[j])   array[k] = aux[i++];
            else                        array[k] = aux[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,4,6,8,9,0,1,2,3,5};
        int[] aux = new int[array.length];
        int mid = (array.length - 1)/2;
        merge(array,aux,0,mid,array.length-1);
        Arrays.sort(array);
    }
}
