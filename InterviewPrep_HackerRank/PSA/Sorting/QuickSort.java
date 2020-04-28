package InterviewPrep_HackerRank.PSA.Sorting;

import java.util.Arrays;

public class QuickSort {
    public int partition(int[] array , int low, int hi){
        int i = low, j= hi+1;
        while (true){
            while (array[++i]< array[low])
                if (i == hi)
                    break;
            while (array[low]<array[--j])
                if (j == low)
                    break;

            if (i>=j) break;
            exchange(array,i,j);
        }
        exchange(array, low, j);
        return j;
    }

    public void exchange(int[] array , int i , int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void sort(int[] array){
        //shuffle the array
        sort(array,0,array.length-1);
    }

    public void sort(int[] array , int i , int j){
        if (j<=i) return ;
        int part = partition(array,i,j);
        sort(array,i,part-1);
        sort(array,part+1,j);
    }


    public static void main(String[] args) {
        QuickSort sort = new QuickSort();
        int[] array = new int[]{1,8,3,7,3,2,8,12,31,0,5};
        sort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
