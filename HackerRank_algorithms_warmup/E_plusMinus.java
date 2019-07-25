//Link:https://www.hackerrank.com/challenges/plus-minus/problem?isFullScreen=true

package HackerRank_algorithms_warmup;
import java.util.*;

public class E_plusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int size = arr.length;
        double positive=0, negative=0, zeros=0;
        for(int i=0; i<size; i++){
            if(arr[i]>0)
                positive++;
            else if (arr[i]<0)
                negative++;
            else
                zeros++;
        }

        System.out.printf("%.6f %n",(positive/size));
        System.out.printf("%.6f %n",(negative/size));
        System.out.printf("%.6f %n",(zeros/size));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
