//https://www.hackerearth.com/practice/algorithms/sorting/merge-sort/practice-problems/algorithm/criminals-little-deepu-and-little-kuldeep/
package InterviewPrep_HackerRank.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class DeepuKuldeep {

    static int packetCount;
    public static void mergerSort(int[] packets,int q){
        if(packets[q] >= packets[q+1]) {
            packetCount++;
        }
    }


    public static void findNumberOfBoxes(int[] packets,int p, int r){
        if(p<r){
            int q = (p+r)/2;
            findNumberOfBoxes(packets,p,q);
            findNumberOfBoxes(packets,q+1,r);
            mergerSort(packets,q);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        for(int i =0 ;i<testcase; i++){
            int size = scan.nextInt();
            int arr[] = new int[size];
            packetCount=1;
            for(int j=0; j<size; j++){
                arr[j] = scan.nextInt();
            }
            System.out.println("From main: "+ Arrays.toString(arr));
            findNumberOfBoxes(arr,0,size-1);
            System.out.println(packetCount);
        }
        scan.close();
    }
}
