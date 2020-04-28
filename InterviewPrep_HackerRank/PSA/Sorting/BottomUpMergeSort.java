package InterviewPrep_HackerRank.PSA.Sorting;

import java.util.Arrays;

public class BottomUpMergeSort {

    int[] aux ;
    public void merge(int[] array , int low , int mid , int hi){
        for (int i = 0 ; i < array.length;i++){
            aux[i] = array[i];
        }
        int i = low;
        int j = mid+1;
        for (int k = low ; k<=hi; k++){
            if (i > mid ) array[k] = aux[j++];
            else if (j > hi) array[k] = aux[i++];
            else if (array[i]< array[j]) array[k] = aux[i++];
            else array[k] = aux[j++];
        }
    }

    public void sort(int[] array){
        int N = array.length;
        aux = new int[N];
        for (int size = 1 ; size< N ; size = size+size){
            System.out.println("Size "+size);
            for (int lo = 0 ; lo< N -size ; lo += size+size){
                System.out.println(lo);
                merge(array,lo,lo+size-1,Math.min(lo+size+size-1,N-1));
            }
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,8,3,7,3,2,8,12,31,0,5};
        BottomUpMergeSort sort = new BottomUpMergeSort();
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
