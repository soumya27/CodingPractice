//Link:https://www.hackerrank.com/challenges/magic-square-forming/problem
package HackerRank_algorithms_implementation;

import java.util.ArrayList;
import java.util.List;

public class M_MagicSquare {


    private static int formingMagicSquare(int[][] s) {
        List<Integer[][]> magicSquares = new ArrayList<>();
        Integer[][] square1 = new Integer[][]{ {8,1,6},{3,5,7},{4,9,2}};
        Integer[][] square2 = new Integer[][]{ {6,1,8},{7,5,3},{2,9,4}};
        Integer[][] square3 = new Integer[][]{ {4,3,8},{9,5,1},{2,7,6}};
        Integer[][] square4 = new Integer[][]{ {2,7,6},{9,5,1},{4,3,8}};
        Integer[][] square5 = new Integer[][]{ {2,9,4},{7,5,3},{6,1,8}};
        Integer[][] square6 = new Integer[][]{ {4,9,2},{3,5,7},{8,1,6}};
        Integer[][] square7 = new Integer[][]{ {6,7,2},{1,5,9},{8,3,4}};
        Integer[][] square8 = new Integer[][]{ {8,3,4},{1,5,9},{6,7,2}};
        magicSquares.add(square1);
        magicSquares.add(square2);
        magicSquares.add(square3);
        magicSquares.add(square4);
        magicSquares.add(square5);
        magicSquares.add(square6);
        magicSquares.add(square7);
        magicSquares.add(square8);
        int min = Integer.MAX_VALUE;

        for (Integer[][] square : magicSquares){
            int sum=0;
            for(int i = 0 ; i < 3; i++){
                for(int j =0 ; j<3 ; j++){
                    sum += Math.abs(square[i][j]- s[i][j]);
                }
            }
            if(sum < min)
                min = sum;
        }
        return min ;
    }

    public static void main(String[] args) {
        int[][] input = new int[][]{
                {4,9,2},
                {3,5,7},
                {8,1,5}
        };

        System.out.println(formingMagicSquare(input));
    }
}
