//Link:https://leetcode.com/contest/weekly-contest-181/problems/check-if-there-is-a-valid-path-in-a-grid/
package leetCode.contest;

public class M_Weekly5366 {
    public static boolean hasValidPath(int[][] grid) {
        int i = 0 ;
        int j = 0;
        int start = grid[i][j];
        int entry = 0;  // 0 is left , 1 right , 2 up and 3 down
        if ( start == 1){
            switch(entry){
                case 0: {
                    start = grid[i][++j];
                    break;
                }
                case 1: {
                    start = grid[i][--j];
                    break;
                }
                case 3:
                case 4:
                    return false;
            }
        }else if(start ==2){
//            can move up or down
        } else if ( start == 3){
//            can move left or down
        } else if (start ==4){
//            can move right or down
        } else if ( start == 5){
//            can move left or up
        } else {
//            can move right or up
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasValidPath(new int[][]{
                {2,4,3},
                {6,5,2}
        }));
    }
}
