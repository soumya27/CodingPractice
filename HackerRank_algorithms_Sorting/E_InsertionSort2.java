//Link:https://www.hackerrank.com/challenges/insertionsort2/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
package HackerRank_algorithms_Sorting;

public class E_InsertionSort2 {

    private static void insertionSort2(int n, int[] arr) {
        for(int i = 1 ; i < n ; i++){
            int key = arr[i];
            int j = i-1;
            while( j>=0 && arr[j]>key){
                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = key;
            printArray(arr);
        }
    }

    private static void printArray(int[] arr){
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println( );
    }

    public static void main(String[] args) {
        int[] arr = new int[] {-20,-3916237, -357920, -3620601 ,7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470 };
        insertionSort2(arr.length,arr);
    }
}
