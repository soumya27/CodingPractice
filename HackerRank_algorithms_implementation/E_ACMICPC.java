//https://www.hackerrank.com/challenges/acm-icpc-team/problem
package HackerRank_algorithms_implementation;

import java.io.*;
import java.math.*;
import java.util.*;

public class E_ACMICPC {

    static int[] acmTeam(String[] topic) {
        int n = topic.length;
        int[] resultArray = new int[2];

        BigInteger[] bi = new BigInteger[n];
        for( int i =0 ; i <n ;i++){
            bi[i]= new BigInteger(topic[i],2);
        }


        for(int i =0; i < n-1 ; i++){
            for(int j = i+1; j<n ; j++){
                BigInteger result = bi[i].or(bi[j]);
                int count = result.bitCount();
                System.out.println("Count: " +count);
                if ( count > resultArray[0] ){
                    resultArray[0] = count;
                    resultArray[1] = 1;
                }
                else if( count == resultArray[0]){
                    resultArray[1]++;
                }
            }
        }
        return resultArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        String[] topic = new String[n];

        for (int i = 0; i < n; i++) {
            String topicItem = scanner.nextLine();
            topic[i] = topicItem;
        }

        int[] result = acmTeam(topic);

        for (int i = 0; i < result.length; i++) {
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


