package HR_DataStructures.Queues;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class P_CastleOnGrid {
    static class Node {
        int x;
        int y;
        float distanceFromSource;

        Node(int x, int y, float dis) {
            this.x = x;
            this.y = y;
            this.distanceFromSource = dis;
        }
    }

    public static void main(String args[])
    {
        char[][] matrix = {
                {'.', '.', '.'},
                {'.', 'X', '.'},
                {'.', 'X', '.'}
        };
        int sx = 2;
        int sy = 0;
        int dx = 2;
        int dy = 2;
        int path = pathExists(matrix,sx,sy,dx,dy);

        System.out.println(path);
    }

    private static int pathExists(char[][] matrix, int sx, int sy, int dx, int dy) {

        Node source = new Node(sx, sy, 1f/matrix.length);
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(source);

        while(!queue.isEmpty()) {
            Node poped = queue.poll();

            if(poped.x == dx && poped.y == dy) {
                return (int)Math.ceil(poped.distanceFromSource);
            }
            else {
                matrix[poped.x][poped.y]='X';

                List<Node> neighbourList = addNeighbours(poped, matrix);
                queue.addAll(neighbourList);
            }
        }
        return -1;
    }

    private static List<Node> addNeighbours(Node poped, char[][] matrix) {

        List<Node> list = new LinkedList<>();

        float perStep = 1f/matrix.length;

        if((poped.x-1 >= 0 && poped.x-1 < matrix.length) && matrix[poped.x-1][poped.y] != 'X') {
            list.add(new Node(poped.x-1, poped.y, poped.distanceFromSource+perStep));
        }
        if((poped.x+1 >= 0 && poped.x+1 < matrix.length) && matrix[poped.x+1][poped.y] != 'X') {
            list.add(new Node(poped.x+1, poped.y, poped.distanceFromSource+perStep));
        }
        if((poped.y-1 >= 0 && poped.y-1 < matrix.length) && matrix[poped.x][poped.y-1] != 'X') {
            list.add(new Node(poped.x, poped.y-1, poped.distanceFromSource+perStep));
        }
        if((poped.y+1 >= 0 && poped.y+1 < matrix.length) && matrix[poped.x][poped.y+1] != 'X') {
            list.add(new Node(poped.x, poped.y+1, poped.distanceFromSource+perStep));
        }
        return list;
    }
}


