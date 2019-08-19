//https://www.hackerrank.com/challenges/cut-the-sticks/problem
package HackerRank_algorithms_implementation;

import java.io.*;
import java.util.*;

public class E_CutTheSticks {

    static int[] cutTheSticks(int[] arr) {
        int min =100000,count =0,counter =0;
        int[] sortedArray = arr.clone();
        int[] result = new int[arr.length];
        Arrays.sort(sortedArray);
        for(int i =0 ; i < sortedArray.length; i++){
            if(sortedArray[i]>0){
                System.out.println("inside");
                min = sortedArray[i];
                for(int j=0 ; j<arr.length; j++){
                    if(arr[j]>0){
                        arr[j]-=min;
                        count++;
                    }
                }
                sortedArray =  arr.clone();
                Arrays.sort(sortedArray);
                result[counter] = count;
                if(count ==1)
                    break;
                counter++;
                count =0;
            }
        }
        return result ;
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

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            if(result[i]!=0)
                bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
