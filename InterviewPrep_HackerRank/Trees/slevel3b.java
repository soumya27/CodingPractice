package InterviewPrep_HackerRank.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.HashSet;

public class slevel3b {

    public static int solution(int[][] map) {
        return breadthFirstSearch (map);
//        String value = "0101010";
    }

    public static int breadthFirstSearch(int[][] map) {
        int[][] dirs = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int n = map.length;
        int m = map[0].length;
        int count = 1;

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, 1}); // start position
        Set<String> visited = new HashSet<>();

        while(!q.isEmpty()) {
            int size = q.size();
            while(size-- != 0) {
                int[] top = q.poll();
                int x = top[0];
                int y = top[1];
                int c = top[2];

                if(x == n-1 && y == m-1) { // if destination is reached return count
                    return count;
                }

                String key = x+"."+y+"."+c;
                if(!visited.add(key)) { // if already visited dont visit again
                    continue;
                }

                for(int[] dir : dirs) {
                    int xx = x + dir[0];
                    int yy = y + dir[1];
                    int cc = c;
                    if(xx < 0 || yy < 0 || xx == n || yy == m) {
                        continue;
                    }
                    if(map[xx][yy] == 1) {
                        if(cc == 0) {
                            continue;
                        }
                        cc -= 1;
                    }
                    q.offer(new int[]{xx, yy, cc});
                }
            }
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] map = new int[][] {
                {0,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,0,0,0,0,0,0,1,1,1,1},
                {0,1,0,1,1,1,1,0,1,1,1,1},
                {0,1,0,0,1,0,0,0,1,1,1,1},
                {0,0,1,0,1,0,1,1,1,1,1,1},
                {1,0,1,0,1,0,1,0,0,0,1,1},
                {1,0,1,0,1,0,1,0,1,0,1,1},
                {1,0,0,0,1,0,0,0,1,0,1,1},
                {1,1,1,1,1,1,1,1,1,0,0,0},
                {1,1,1,1,1,1,1,1,1,1,1,0}
        };
        System.out.println(solution(map));

        map = new int[][] {
                {0,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1},
                {0,1,0,0,0,0,0,0,1,1},
                {0,1,0,1,1,1,1,0,1,1},
                {0,1,0,0,1,0,0,0,1,1},
                {0,0,1,0,1,0,1,1,1,1},
                {1,0,1,0,1,0,1,0,0,0},
                {1,0,1,0,1,0,1,0,1,0},
                {1,0,0,0,1,0,0,0,1,0}
        };

        System.out.println(solution(map));

        map = new int[][]{
                {0,0,1,0,0,0},
                {1,0,0,0,1,0},
                {0,1,1,1,1,0},
                {0,0,0,0,0,0},
                {0,0,0,1,1,1},
                {0,0,0,0,0,0}
        };
        System.out.println(solution(map));
    }
}
