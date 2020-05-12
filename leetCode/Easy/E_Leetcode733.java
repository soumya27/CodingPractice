//Link:https://leetcode.com/problems/flood-fill/
package leetCode.Easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class E_Leetcode733 {

    static int rowLength;
    static int coLength;

    public static class coordinate {
        int x, y;
        coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public static boolean isValid(int x, int y ){
        return x>=0 && x<rowLength && y>=0 && y< coLength;
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        rowLength = image.length;
        coLength= image[0].length;
        int srcColor = image[sr][sc];
        image[sr][sc]= newColor;
        Queue<coordinate> queue = new LinkedList<>();
        queue.add(new coordinate(sr,sc));
        coordinate[] moves = new coordinate[]{
                new coordinate(0,-1),
                new coordinate(0,1),
                new coordinate(1,0),
                new coordinate(-1,0)
        };
        boolean[][] visited  = new boolean[rowLength][coLength];
        for (boolean[] row : visited){
            Arrays.fill(row, false);
        }
        visited[sr][sc] = true;

        while (!queue.isEmpty()){
            coordinate current = queue.poll();
            for (coordinate move : moves){
                coordinate next = new coordinate(current.x+move.x, current.y+move.y);
                if ( isValid(next.x, next.y) && image[next.x][next.y]== srcColor && !visited[next.x][next.y]){
                    visited[next.x][next.y] = true;
                    image[next.x][next.y]= newColor;
                    queue.add(next);
                }
            }
        }
        return image;
    }


    public static void main(String[] args) {
        int[][] image = new int[][]{
                {1,1,1},{1,1,0},{1,0,1}
        };

        int[][] result = floodFill(image,1,1,2);

        for (int[] row : result){
            System.out.println(Arrays.toString(row));
        }
    }
}
