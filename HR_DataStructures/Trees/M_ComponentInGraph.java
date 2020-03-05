package HR_DataStructures.Trees;

public class M_ComponentInGraph {

    private static int[] parent;   // parent[i] = parent of i
    private static int[] height;   // height[i] = height of subtree rooted at i
    private static int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    private static int[] componentsInGraph(int[][] gb) {

        for (int[] ints : gb) {
            int p = ints[0];
            int q = ints[1];
            if (!connected(p, q)) {
                union(p, q);
            }
        }

        for (int value : height) {
            if (value != 0 && value != 1) {
                max = Math.max(value, max);
                min = Math.min(value, min);
            }
        }
       return new int[] {min, max};
    }

    private static boolean connected(int p, int q){
        return find(p) == find(q);
    }

    private static int find(int p){
        int root = p ;
        while (root != parent[root]){
            root = parent[root];
        }
        return root;
    }

    private static void union(int p, int q){
        int i = find(p);
        int j = find(q);
        if (i == j)
            return;
        if (height[i] < height[j]) {
            parent[i] = j;
            height[j] += height[i];
            height[i]=0;
        } else {
            parent[j] = i;
            height[i] += height[j];
            height[j]=0;
        }
    }

    public static void main(String[] args) {
        int[][] gb = new int[][]{
                {1,17},{5,13},{7,12},{5,17},{5,12},
                {2,17},{1,18},{8,13},{2,15},{5,20}
        };
        int n = 10;
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
