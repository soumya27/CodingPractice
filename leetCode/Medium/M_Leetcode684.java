//Link:https://leetcode.com/problems/redundant-connection/
package leetCode.Medium;

public class M_Leetcode684 {

    public static class DSU{
        int[] parent;

        public DSU(int n){
            parent = new int[n+1];
            for (int i =1 ; i < n+1; i++){
                parent[i] = i;
            }
        }

        public void union(int p,int q){
            for(int i=1; i<parent.length; i++){
                if(parent[i]== parent[q])
                    parent[i]= parent[p];
            }
            parent[q] = parent[p];
        }

        public boolean connected(int p, int q){
            return parent[p]== parent[q];
        }

    }
    public static int[] findRedundantConnection(int[][] edges) {
        DSU dsu = new DSU(edges.length);
        int[] result = new int[2];
        for (int[] pair : edges){
            if(! dsu.connected(pair[0],pair[1])){
                dsu.union(pair[0],pair[1]);
            }else{
                result[0]= pair[0];
                result[1] = pair[1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] edges = new int[][]{
                {3,7},{1,4},
                {2,8},{1,6},
                {7,9},{6,10},
                {1,7},{2,3},
                {8,9},{5,9}
        };
        int[] result = findRedundantConnection(edges);
        for( int value : result)
            System.out.println(value);
    }
}
