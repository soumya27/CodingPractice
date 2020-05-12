package leetCode.Easy;

public class E_Leetcode1232 {

    public static boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length==2)
            return true;
        int length = coordinates.length;
        int y1 = coordinates[0][1];
        int y2 = coordinates[length-1][1] ;
        int x1 = coordinates[0][0];
        int x2 = coordinates[length-1][0];
        int slope = (y2 - y1 ) / ( x2 - x1 );
        for (int i = 1 ; i < length-1;i++){
            int LHS = coordinates[i][1]-y1;
            int RHS = slope* ( coordinates[i][0]-x1);
            if (LHS != RHS)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = new int[][]{
                {1,1},{2,2},{3,4},{4,5},{5,6},{7,7}
        };

        int[][] coordinates1 = new int[][]{
                {1,2},{2,3}
        };

        System.out.println(checkStraightLine(coordinates));
        System.out.println(checkStraightLine(coordinates1));

    }
}
