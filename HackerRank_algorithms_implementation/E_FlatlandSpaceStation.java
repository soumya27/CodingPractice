//https://www.hackerrank.com/challenges/flatland-space-stations/problem
package HackerRank_algorithms_implementation;

import java.io.*;
import java.util.*;

public class E_FlatlandSpaceStation {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        int min =100000;
        int[] minDistance = new int[n];
        for( int i =0 ; i< n; i++){
            for(int j=0;j<c.length;j++){
                if(Math.abs(c[j]-i)<min)
                    min = Math.abs(c[j]-i);
            }
            minDistance[i] = min;
            min =100000;
        }
        int max = minDistance[0];
        for( int i =0 ; i< n ; i++){
            max = Math.max(max,minDistance[i]);
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
