//Link: https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
package InterviewPrep_HackerRank.Arrays;
import java.io.*;
import java.util.*;

public class Hourglass {

    static int hourglassSum(int[][] arr) {

        int size = arr.length;
        int max = -1;
        int[][] newarray = new int[size][size];
        for (int i =0; i <size-2; i++){
            int sum =0 ;
            for(int j = 0 ; j<size-2; j++){
                for(int k =j ; k <j+2; k++){
                    sum = sum + arr[i][k] + arr[i+2][k];
                }
                sum = sum + arr[i+1][(j+2)/2];
                if(sum > max)
                    max =sum;
                arr[i][j]= sum;
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
