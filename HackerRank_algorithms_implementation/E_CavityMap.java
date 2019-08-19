//https://www.hackerrank.com/challenges/cavity-map/problem
package HackerRank_algorithms_implementation;

import java.io.*;
import java.util.*;

public class E_CavityMap {

    static boolean isBorderCell(int i, int j, int size){
        return (i == 0 || j ==0 || i == size-1 || j == size-1);
    }

    static boolean checkAdjacent(int i , int j , char[][] grid){
        int current = Character.getNumericValue(grid[i][j]);
        int top = Character.getNumericValue(grid[i-1][j]);
        int bottom = Character.getNumericValue(grid[i+1][j]);
        int left = Character.getNumericValue(grid[i][j-1]);
        int right = Character.getNumericValue(grid[i][j+1]);
        if(left < current  && right < current && top < current && bottom < current)
            return true;
        else
            return false;
    }

    // Complete the cavityMap function below.
    static char[][] cavityMap(String[] grid) {
        int size = grid.length;
        int len = grid[0].length();
        char[][] numberGrid = new char[size][len];
        for(int i =0 ; i <size; i++){
            for(int j=0; j<len;j++){
                numberGrid[i][j]= grid[i].charAt(j);
            }
        }
        for( int i =0 ;i<size;i++){
            for(int j=0;j<size;j++){
                if(!isBorderCell(i,j,size)){
                    if(checkAdjacent(i,j,numberGrid)){
                        numberGrid[i][j]= 'X';
                    }
                }

            }
        }
        return numberGrid;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] grid = new String[n];

        for (int i = 0; i < n; i++) {
            String gridItem = scanner.nextLine();
            grid[i] = gridItem;
        }

        char[][] result = cavityMap(grid);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
