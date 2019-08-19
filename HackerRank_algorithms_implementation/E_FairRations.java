//https://www.hackerrank.com/challenges/fair-rations/problem
package HackerRank_algorithms_implementation;

import java.io.*;
import java.util.*;

public class E_FairRations {

    static int fairRations(int[] line) {
        int count =0, size = line.length;
        for(int i =0 ; i <size-1;i++){
            if(line[i]%2 !=0){
                line[i]++;
                line[i+1]++;
                count+=2;
            }
        }
        if(line[size-1]%2 !=0)
            count= -1;
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] B = new int[N];

        String[] BItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < N; i++) {
            int BItem = Integer.parseInt(BItems[i]);
            B[i] = BItem;
        }

        int result = fairRations(B);
        if(result >=0)
            bufferedWriter.write(String.valueOf(result));
        else
            bufferedWriter.write("NO");
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

