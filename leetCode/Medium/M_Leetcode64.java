//Link:https://leetcode.com/problems/minimum-path-sum/
package leetCode.Medium;

public class M_Leetcode64 {

    public static int minPathSum(int[][] grid) {
        if( grid.length ==0 || grid[0].length==0)
            return 0;
        int row = grid.length;
        int col = grid[0].length;

        int[] dp = new int[col];
        dp[0] = grid[0][0];

        for (int i = 1 ; i < col; i++){
            dp[i]= dp[i-1]+grid[0][i];
        }

        for (int i = 1; i < row; i++){
            dp[0] += grid[i][0];
            for (int j=1; j < col; j++){
                dp[j]= grid[i][j]+ Math.min(dp[j-1],dp[j]);
            }
        }
        return dp[col-1];
    }

    public static void main(String[] args) {

        int[][] grid = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };

        System.out.println(minPathSum(grid));
    }
}
