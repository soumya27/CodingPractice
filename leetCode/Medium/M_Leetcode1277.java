//Link:https://leetcode.com/problems/count-square-submatrices-with-all-ones/
package leetCode.Medium;

public class M_Leetcode1277 {
    public static int countSquares(int[][] matrix) {
        int sum =0 ;
        int len = matrix.length;
        // need to find squares of size 3,2,1
        while (len-- >=1){
            for(int i = 0 ; i < matrix.length; i++){
                for (int j = 0 ; j <matrix[0].length;j++){
                    sum += findNeigbhors(i,j,len);
                }
            }
        }
        return sum;
    }

    public static int findNeigbhors(int i,int j,int len){
        
        return 0;
    }
    public static void main(String[] args) {
        int[][] input = new int[][]{
                {0,1,1,1},{1,1,1,1},{0,1,1,1}
        };
        System.out.println(countSquares(input));
    }
}
