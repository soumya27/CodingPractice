package InterviewPrep_HackerRank.Sorting;

import java.util.Arrays;

public class QuicksortExample {

    private static void quickSort(int[] array){
        quickSort(array,0,array.length-1);
    }

    private static void quickSort(int[] array, int left, int right){
        if(left >=right){
            return;
        }
        int pivot = array[(left+right)/2];
        int index =parition(array,left,right,pivot);
        quickSort(array,left,index-1);
        quickSort(array,index,right);
    }

    private static int parition(int[] array, int left, int right, int pivot){
        while( left <= right){
            while(array[left]< pivot){
                left++;
            }
            while(array[right]>pivot){
                right--;
            }
            if( left<=right){
                swap(array,left,right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] array, int left, int right){
        int temp = array[left];
        array[left]= array[right];
        array[right]= temp;
    }

    public static void main(String[] args) {
        int[] arraytosort = new int[]{
                15,3,9,8,5,2,7,1,6
        };
        quickSort(arraytosort);
        System.out.println(Arrays.toString(arraytosort));
    }
}
