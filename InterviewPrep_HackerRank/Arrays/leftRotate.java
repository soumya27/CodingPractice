//Link:https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
package InterviewPrep_HackerRank.Arrays;

import java.io.*;
import java.util.*;

public class leftRotate {

    // Complete the rotLeft function below.
//    Method 1
//    static int[] rotLeft(int[] a, int d) {
//        int first;
//        int size = a.length;
//        while (d-- != 0){
//            first = a[0];
//            for(int i =0 ; i < size-1; i++){
//                a[i]= a[i+1];
//            }
//            a[size-1]= first;
//        }
//        return a;
//    }

//    Method 2
//    static int[] rotLeft(int[] a, int d) {
//        int n = a.length;
//        int rotArray[] = new int[n];
//        d = d% a.length;
//        for (int i=d ,j=0; j<n ; i++,j++){
//            rotArray[j]= a[i];
//            if(i+1 == n)
//                i=-1;
//        }
//        return rotArray;
//    }

//    Method 3
//    right rotation = array size - left rotation
//    new index = (old index + n - leftrotation ) %n
    static int[] rotLeft(int[] a , int d ){
        int n = a.length;
        int rotArray[]= new int[n];
        int newIndex =0;
        for(int oldIndex= 0 ; oldIndex<n ; oldIndex++){
            newIndex = (oldIndex+n-d)%n;
            rotArray[newIndex]= a[oldIndex];
        }
        return rotArray;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
