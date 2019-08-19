//https://www.hackerrank.com/challenges/equality-in-a-array/problem/
package HackerRank_algorithms_implementation;

import java.io.*;
import java.util.*;

public class E_EqualizeArray {

    // Complete the equalizeArray function below.
    static int equalizeArray(int[] arr) {
        int[] values= new int[101];
        int max =-1;
        for(int i =0 ; i < arr.length; i++){
            values[arr[i]]++;
            if(values[arr[i]]>max)
                max = values[arr[i]];
        }
        return (arr.length - max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = equalizeArray(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
