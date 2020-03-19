package leetCode.contest;

import java.util.LinkedList;
import java.util.List;

public class E_Weekly {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result= new LinkedList<>();
        int minCol = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (ints[j] >= maxRow)
                    result.add(ints[j]);
                else if (ints[j] <= minCol) {
                    result.add(ints[j]);
                }
            }
        }
        System.out.println(minCol + " "+ maxRow );
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = new int [][]{
                {3,7,8},
                {9,11,13},
                {15,16,17}
        };
        System.out.println(luckyNumbers(matrix));
    }
}
