//Link:https://leetcode.com/problems/number-of-islands/
package leetCode.Medium;

public class M_Leetcode200 {

    private int findLand(char[][] grid, int i , int j ){
        if( i< 0 || i>= grid.length || j<0 || j>= grid[0].length|| grid[i][j] == '0')
            return 0 ;

        grid[i][j] = '0' ;

        findLand(grid, i-1, j); // top
        findLand(grid, i+1, j); // bottom
        findLand(grid, i, j-1); // left
        findLand(grid, i, j+1); // right

        return 1;
    }

    public int numIslands(char[][] grid) {
        int count = 0 ;
        for( int i = 0 ; i <grid.length; i++){
            for(int j=0 ; j< grid[0].length; j++){
                if( grid[i][j] == '1'){
                    count += findLand(grid,i,j);
                }
            }
        }
        return count;
    }
}
