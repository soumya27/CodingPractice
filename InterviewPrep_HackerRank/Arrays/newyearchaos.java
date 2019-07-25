//link: https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
package InterviewPrep_HackerRank.Arrays;

import java.util.*;

public class newyearchaos {

    static void minimumBribes(int[] a) {
        int size = a.length;
        int temp;
        boolean tooChaotic = false;
        int moves= 0;
        for (int i =size-1 ; i >0 ;){
            if(a[i]!= i+1){
                temp = i-1;
                if(a[temp]==i+1)
                {
                    a[temp]= a[i];
                    a[i]=i+1;
                    moves++;
                }
                else {
                    temp--;
                    if(a[temp]==i+1){
                        a[temp]= a[temp+1];
                        a[temp+1]= a[i];
                        a[i]=i+1;
                        moves=moves+2;
                    }
                    else{
                        tooChaotic=true;
                        break;
                    }
                }
            }
            i--;
        }
        if(tooChaotic){
            System.out.println("Too chaotic");
        }else {
            System.out.println(moves);
        }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
