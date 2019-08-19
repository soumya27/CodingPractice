//https://www.hackerrank.com/challenges/happy-ladybugs/submissions/code/118789053
package HackerRank_algorithms_implementation;

import java.io.*;
import java.util.*;

public class E_HappyLadyBug {

    static String isUnhappy(String ladyBugs){
        int count =1;
        int size = ladyBugs.length();
        for(int i=0 ; i< size ; i++){
            if(i < size -1){
                if( ladyBugs.charAt(i) == '_')
                    break;
                else if(ladyBugs.charAt(i)==ladyBugs.charAt(i+1))
                    count++;
                else if (ladyBugs.charAt(i)!=ladyBugs.charAt(i+1) && count ==1)
                    return "NO";
                else
                    count =1;
            }
            else if(size == 1){
                if(!(ladyBugs.charAt(i)=='_'))
                    return "NO";
            }
            else{
                if(ladyBugs.charAt(i)!=ladyBugs.charAt(i-1)&& !(ladyBugs.charAt(i)=='_'))
                    return "NO";
            }

        }
        return "YES";
    }


    static String happyLadybugs(String OldB) {

        if(OldB.contains("_")){
            char tempArray[] = OldB.toCharArray();
            Arrays.sort(tempArray);
            String b =new String(tempArray);
            System.out.println(b);
            return isUnhappy(b);
        }
        else{
            return isUnhappy(OldB);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int gItr = 0; gItr < g; gItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String b = scanner.nextLine();

            String result = happyLadybugs(b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

