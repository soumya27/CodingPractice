package InterviewPrep_HackerRank.PSA.Sorting;

import java.util.Arrays;

public class MergeSort {
    private void merge(int[] array, int[] aux, int low, int mid, int hi){
        for (int i = 0 ; i< array.length; i++){
            aux[i]= array[i];
        }
        int i = low, j = mid+1;
        for (int k =low; k<= hi; k++){
            if ( i > mid ) array[k] = aux[j++];
            else if ( j > hi) array[k] =aux[i++];
            else if (aux[i]<aux[j]) array[k]= aux[i++];
            else array[k] = aux[j++];
        }
    }

    private void sort( int[] array ,int[] aux ,int low , int hi){
        if (hi <= low) return;
        int mid = low + (hi - low)/2;
        sort(array,aux,low,mid);
        sort(array,aux,mid+1,hi);
        merge(array,aux,low,mid,hi);
    }

    public void sort(int[] array){
        int[] aux = new int[array.length];
        sort(array,aux,0,array.length-1);
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,8,3,7,3,2,8,12,31,0,5};
        MergeSort sort = new MergeSort();
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
