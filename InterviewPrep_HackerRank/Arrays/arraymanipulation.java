package InterviewPrep_HackerRank.Arrays;

import java.io.*;
import java.util.*;

public class arraymanipulation {

//    Method 1
//    worst case solution - brute force
//    complexity is O(n*m)
//    static long arrayManipulation(int n, int[][] queries) {
//    long max =0;
//    int m = queries.length;
//    int array[] = new int[n];
//    for(int i = 0 ; i <m ;i++){
//        for(int j= queries[0][i]; j<=queries[1][i];j++){
//            array[j]=array[j]+queries[2][i];
//            if(array[j]>max){
//                max=array[j];
//            }
//        }
//    }
//    return max;
//    }

//    Method 2
//    using prefix algorithm
//    add k at a and sub k at b+1 for m queries
//    then perform prefix algorithm and find the max
//    complexity of the solution will be O(n+m)
    static long arrayManipulation(int n, int[][]queries){
        long max=0;
        long array[] = new long[n+2];
        for( int i = 0 ; i < queries.length; i ++){
            int a = queries[0][i];
            int b = queries[1][i];
            int k = queries[2][i];
            array[a]+= k;
            array[b+1]-=k;
        }
        long sum =0 ;
        for(int i =0 ; i <array.length; i++){
            sum += array[i];
            max = Math.max(sum,max);
        }
        return max;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
