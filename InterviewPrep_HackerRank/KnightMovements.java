package InterviewPrep_HackerRank;
import java.util.*;

public class KnightMovements {

    static class Coordinate
    {
        int x, y;
        int dis;
        public Coordinate(int x, int y, int dis)
        {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }

    static boolean isInside(int x, int y, int N)
    {
        return x >= 0 && x < N && y >= 0 && y < N;
    }

    static int minStepToReachTarget(int[] knightPos, int[] targetPos, int N)
    {
        int[] xMovement = {-2, -1, 1, 2, -2, -1, 1, 2};
        int[] yMovement = {-1, -2, -2, -1, 1, 2, 2, 1};
        Coordinate current ;
        int x, y;
        boolean[][] visit = new boolean[N][N];
        for (int i = 0; i < N; i++)
            Arrays.fill(visit[i],false);

        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(knightPos[0], knightPos[1], 0));
        visit[knightPos[0]][knightPos[1]] = true;

        while (!queue.isEmpty())
        {
            current = queue.poll();

            if (current.x == targetPos[0] && current.y == targetPos[1])
                return current.dis;

            for (int i = 0; i < 8; i++)
            {
                x = current.x + xMovement[i];
                y = current.y + yMovement[i];
                if (isInside(x, y, N) && !visit[x][y])
                {
                    visit[x][y] = true;
                    queue.add(new Coordinate(x, y, current.dis + 1));
                }
            }
        }
        return -1;
    }

    public static int solution(int src, int dest) {

        int N = 8;
        int[] knightPos = {src/N, src%N};
        int[] targetPos = {dest/N, dest%N};

        int[] xMovement = {-2, -1, 1, 2, -2, -1, 1, 2};
        int[] yMovement = {-1, -2, -2, -1, 1, 2, 2, 1};

        Coordinate current ;
        int x, y;
        boolean[][] visit = new boolean[N][N];

        for (int i = 0; i < N; i++)
            Arrays.fill(visit[i],false);

        Queue<Coordinate> queue = new LinkedList<>();
        queue.add(new Coordinate(knightPos[0], knightPos[1], 0));
        visit[knightPos[0]][knightPos[1]] = true;

        while (!queue.isEmpty())
        {
            current = queue.poll();

            if (current.x == targetPos[0] && current.y == targetPos[1])
                return current.dis;

            for (int i = 0; i < 8; i++)
            {
                x = current.x + xMovement[i];
                y = current.y + yMovement[i];
                if (isInside(x, y, N) && !visit[x][y])
                {
                    visit[x][y] = true;
                    queue.add(new Coordinate(x, y, current.dis + 1));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int N = 8;
        int src =19;
        int des = 36;
        System.out.println(solution(src, des));
    }
}


