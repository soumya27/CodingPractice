//Link:https://leetcode.com/problems/sort-the-matrix-diagonally/
package leetCode.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class M_Leetcode1329 {

    public static int[][] diagonalSort(int[][] mat) {
        List<List<Integer>> storeDiagonals = new ArrayList<>();
        for (int row = 0 ; row< mat.length; row++){
            int i =row;
            int j = 0;
            List<Integer> singleRow = new ArrayList<>();
            while(i < mat.length && j< mat[0].length){
                singleRow.add(mat[i++][j++]);
            }
            storeDiagonals.add(singleRow);
        }
        for ( int col = 1 ; col < mat[0].length; col++){
            int i =0;
            int j = col;
            List<Integer> singleRow = new ArrayList<>();
            while(j < mat[0].length && i<mat.length){
                singleRow.add(mat[i++][j++]);
            }
            storeDiagonals.add(singleRow);
        }
        for (List<Integer> row : storeDiagonals){
            Collections.sort(row);
        }
        for (int row = 0 ; row< mat.length; row++){
            int i =row;
            int j = 0;
            List<Integer> singleRow = storeDiagonals.get(row);
            while(i < mat.length && j< mat[0].length){
                mat[i++][j++]= singleRow.get(Math.min(i-1,j-1));
            }
        }
        for (int col = 1 ; col< mat[0].length; col++){
            int i =0;
            int j = col;
            List<Integer> singleRow = storeDiagonals.get(mat.length+col-1);
            while(i < mat.length && j< mat[0].length){
                mat[i++][j++]= singleRow.get(Math.min(i-1,j-1));

            }
        }
        return mat;
    }

    public static void print(int[][] array ){
        for (int i = 0 ; i <array.length; i++){
            for (int j = 0 ; j <array[0].length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] input = new int[][]{
                {3,3,1,1},
                {2,2,1,2},
                {1,1,1,2}
        };
        System.out.println(diagonalSort(input));
    }
}
