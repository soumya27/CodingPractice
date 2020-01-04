//Link:https://www.hackerrank.com/challenges/insertionsort1/problem?h_r=next-challenge&h_v=zen
package HackerRank_algorithms_Sorting;

public class E_InsertionSort1 {

    private static void insertionSort1(int n, int[] arr) {
        int key = arr[n-1]; // last element
        int j=n-2;
        while(j>=0 && arr[j]>key){
            arr[j+1]= arr[j];
            j--;
            printArray(arr);
        }
        arr[j+1]= key;
        printArray(arr);
    }

    private static void printArray(int[] arr){
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println( );
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,5,6,10,2};
        insertionSort1(arr.length,arr);
    }
}
