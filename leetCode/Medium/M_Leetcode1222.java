//Link:https://leetcode.com/problems/queens-that-can-attack-the-king/
package leetCode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class M_Leetcode1222 {

    public static List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> result = new ArrayList<>();
        int     rowrightDistance= Integer.MAX_VALUE,
                rowleftDistance = Integer.MAX_VALUE,
                coldowntDistance= Integer.MAX_VALUE,
                colupDistance= Integer.MAX_VALUE,
                tlDistance =Integer.MAX_VALUE ,
                trDistance = Integer.MAX_VALUE,
                dlDistance =Integer.MAX_VALUE,
                drDistance = Integer.MAX_VALUE;
        int[]   rowsright = new int[2],
                rowsleft = new int[2],
                coldown= new int[2],
                colup = new int[2],
                tldia= new int[2],
                trdia = new int[2],
                dldia = new int[2],
                drdia = new int[2];

        Arrays.fill(rowsright, -1);
        Arrays.fill(rowsleft, -1);
        Arrays.fill(coldown, -1);
        Arrays.fill(colup, -1);
        Arrays.fill(tldia, -1);
        Arrays.fill(trdia, -1);
        Arrays.fill(drdia, -1);
        Arrays.fill(dldia, -1);

        for (int[] place : queens){

            if (place[0] == king [0] && place[1]> king[1]) { // same row right
                if (Math.abs(king[1]-place[1])< rowrightDistance){
                    rowrightDistance = Math.abs(king[1]-place[1]);
                    rowsright = place;
                }
            } else if (place[0] == king [0] && place[1]< king[1]) { // same row left
                if (Math.abs(king[1]-place[1])< rowleftDistance){
                    rowleftDistance = Math.abs(king[1]-place[1]);
                    rowsleft = place;
                }
            } else if (place[1] == king [1] && place[0]> king[0]) { // same col down
                if (Math.abs(king[0]-place[0])< coldowntDistance){
                    coldowntDistance = Math.abs(king[0]-place[0]);
                    coldown = place;
                }
            } else if (place[1] == king [1] && place[0]< king[0]) { // same col up
                if (Math.abs(king[0]-place[0])< colupDistance){
                    colupDistance = Math.abs(king[0]-place[0]);
                    colup = place;
                }
            }else if ( Math.abs(place[0]-king[0]) ==  Math.abs(place[1]-king[1])  && place[0]<king[0] && place[1]<king[1]){ // top-left diagonal
                if (Math.abs(king[0]-place[0])< tlDistance){
                    tlDistance = Math.abs(king[0]-place[0]);
                    tldia = place;
                }
            }
            else if ( Math.abs(place[0]-king[0]) ==  Math.abs(place[1]-king[1])  && place[0]<king[0] && place[1]>king[1]){ // top-right diagonal
                if (Math.abs(king[0]-place[0])< trDistance){
                    trDistance = Math.abs(king[0]-place[0]);
                    trdia = place;
                }
            }
            else if ( Math.abs(place[0]-king[0]) ==  Math.abs(place[1]-king[1])   && place[0]>king[0] && place[1]<king[1]){ // down-left diagonal
                if (Math.abs(king[0]-place[0])< dlDistance){
                    dlDistance = Math.abs(king[0]-place[0]);
                    dldia = place;
                }
            }else if ( Math.abs(place[0]-king[0]) ==  Math.abs(place[1]-king[1])  && place[0]>king[0] && place[1]>king[1]){ // down-right diagonal
                if (Math.abs(king[0]-place[0])< drDistance){
                    drDistance = Math.abs(king[0]-place[0]);
                    drdia = place;
                }
            }
        }

        if (rowsleft[0]!= -1){
            List<Integer> row = new ArrayList<>();
            row.add(rowsleft[0]);
            row.add(rowsleft[1]);
            result.add(row);
        }
        if (rowsright[0]!= -1){
            List<Integer> row = new ArrayList<>();
            row.add(rowsright[0]);
            row.add(rowsright[1]);
            result.add(row);
        }
        if (coldown[0]!= -1){
            List<Integer> row = new ArrayList<>();
            row.add(coldown[0]);
            row.add(coldown[1]);
            result.add(row);
        }
        if (colup[0]!= -1){
            List<Integer> row = new ArrayList<>();
            row.add(colup[0]);
            row.add(colup[1]);
            result.add(row);
        }
        if (tldia[0]!= -1){
            List<Integer> row = new ArrayList<>();
            row.add(tldia[0]);
            row.add(tldia[1]);
            result.add(row);
        }
        if (trdia[0]!= -1){
            List<Integer> row = new ArrayList<>();
            row.add(trdia[0]);
            row.add(trdia[1]);
            result.add(row);
        }
        if (drdia[0]!= -1){
            List<Integer> row = new ArrayList<>();
            row.add(drdia[0]);
            row.add(drdia[1]);
            result.add(row);
        }
        if (dldia[0]!= -1){
            List<Integer> row = new ArrayList<>();
            row.add(dldia[0]);
            row.add(dldia[1]);
            result.add(row);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] queen = new int[][]{
                {1,3},{0,7},{5,1},{2,5},{7,2},{1,2},{6,7},{3,3},
        {5,5},{1,5},{5,0},{0,4},{4,1},{1,1},{3,2},{2,3},{4,2},{1,0}
        ,{6,5},{2,7},{3,1},{4,3},{3,4}
        };
        int[] king = new int[]{0,2};
        for (List<Integer> row : queensAttacktheKing(queen,king)){
            System.out.println(row);
        }
    }
}
