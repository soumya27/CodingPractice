//Link:https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3306/
package leetCode.Medium;


import java.util.ArrayList;
import java.util.List;

public class Leetcode_30day21 {

    public static class BinaryMatrix{
        int[][] array;

        BinaryMatrix(int[][] array){
            this.array = array;
        }

        public int get(int row, int col) {
            return array[row][col];
        }

        public List<Integer> dimensions() {
            List<Integer> dimension = new ArrayList<>();
            dimension.add(array.length);
            dimension.add(array[0].length);
            return dimension;
        }
    }

    public static int binarySearch(BinaryMatrix binaryMatrix, int row, int start, int end){
        if ( start >= end ){
            int mid = (end-start)/2;
            int midValue = binaryMatrix.get(row,mid);
            if ( midValue == 1){
                return mid;
            }else {
                binarySearch(binaryMatrix, row, mid+1,end);
            }
        }
        return -1;
    }

    public static int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> dimensions = binaryMatrix.dimensions();
//        System.out.println(dimensions.get(0)+" , "+ dimensions.get(1));
        List<Integer> onesInRow = new ArrayList<>();

        // find the index of first 1 in row
        int index = binarySearch(binaryMatrix,0, 0, dimensions.get(0)-1);
        System.out.println(index);
        return 0 ;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{
                {0,0,0,1},
                {0,0,1,1},
                {0,1,1,1}
        };
        BinaryMatrix matrix = new BinaryMatrix(array);
        System.out.println(leftMostColumnWithOne(matrix));
    }
}
