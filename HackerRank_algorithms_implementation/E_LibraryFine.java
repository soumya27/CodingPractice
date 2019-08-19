//https://www.hackerrank.com/challenges/library-fine/problem
package HackerRank_algorithms_implementation;

import java.io.*;
import java.util.*;

public class E_LibraryFine {

    static int libraryFine( int returnDate,int returnMonth,int returnYear, int dueDate,int dueMonth,int dueYear)
    {
        int fine=0;
        if (returnYear > dueYear)
            fine= 10000;
        else if (returnYear == dueYear ){
            if(returnMonth > dueMonth)
                fine= 500* (returnMonth-dueMonth);
            else if(returnMonth == dueMonth) {
                if(returnDate > dueDate)
                    fine = 15* ( returnDate - dueDate);
            }
        }
        return fine;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] d1M1Y1 = scanner.nextLine().split(" ");

        int d1 = Integer.parseInt(d1M1Y1[0]);

        int m1 = Integer.parseInt(d1M1Y1[1]);

        int y1 = Integer.parseInt(d1M1Y1[2]);

        String[] d2M2Y2 = scanner.nextLine().split(" ");

        int d2 = Integer.parseInt(d2M2Y2[0]);

        int m2 = Integer.parseInt(d2M2Y2[1]);

        int y2 = Integer.parseInt(d2M2Y2[2]);

        int result = libraryFine(d1, m1, y1, d2, m2, y2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

