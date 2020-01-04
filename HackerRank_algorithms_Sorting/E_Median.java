//Link:https://www.hackerrank.com/challenges/find-the-median/problem?h_r=next-challenge&h_v=zen
package HackerRank_algorithms_Sorting;

public class E_Median {

    private static void sort(int[] array ){ // insertion sort
        for(int i=1; i<array.length;i++){
            int key = array[i];
            int j =i-1;
            while(j>0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]= key;
        }
    }

    private static int findMedian(int[] arr) {
        // sort array
        sort(arr);
        // return midpoint
        return arr[arr.length/2];
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 1 ,2 ,4 ,6, 5, 3};
        System.out.println(findMedian(array));
    }
}
