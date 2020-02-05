package HR_DataStructures.Trees;

public class M_ComponentInGraph {

    private static int[] parent;   // parent[i] = parent of i
    private static int[] height;   // height[i] = height of subtree rooted at i
    private static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    static int[] componentsInGraph(int[][] gb) {

        for( int i = 0 ; i < gb.length; i ++){
            int p = gb[i][0];
            int q =gb[i][1];
            if (!connected(p,q)){
                union(p,q);
            }
        }
       return new int[] {min, max};
    }

    static boolean connected(int p ,int q){
        return find(p) == find(q);
    }

    static int find (int p){
        int root = p ;
        while (root != parent[root]){
            root = parent[root];
        }
        return root;
    }

    static void union(int p , int q ){
        int i = find(p);
        int j = find(q);
        if (i == j)
            return;
        // TODO make shorter root point to taller one
        if (height[i] < height[j]) {
            parent[i] = j;
            height[j] += height[i];
            max = Math.max(height[j], max);
            min = Math.min (height[j],min);
        } else {
            parent[j] = i;
            height[i] += height[j];
            max = Math.max(height[i], max);
            min = Math.min (height[i],min);
        }
    }

    public static void main(String[] args) {
        int[][] gb = new int[][]{
                {1,6},{2,7},{3,8},{4,9},{2,6}
        };
        int n = 5;
        parent = new int[2*n+1];
        height = new int[2*n+1];
        for (int i = 1; i <= 2*n; i++) {
            parent[i] = i;
            height[i] = 1;
        }
        for (int value : componentsInGraph(gb)){
            System.out.print(value + " ");
        }
    }
}
