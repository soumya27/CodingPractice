//Link:https://leetcode.com/problems/jump-game-iii/
package leetCode.Medium;

import java.util.ArrayList;

public class M_Leetcode1306 {

    private int[] parent;   // parent[i] = parent of i
    private int[] height;   // height[i] = height of subtree rooted at i

    public boolean canReach(int[] arr, int start) {
        ArrayList<Integer> goals = new ArrayList<>();
        init(arr.length);
        for(int i = 0; i< arr.length; i++){
            if (arr[i] == 0)
                goals.add(i);
            int move1 = Math.abs(i - arr[i]);
            int move2 = i+arr[i] ;
            if( isvalid(move1,arr.length))
                if( !isConnected(i,move1))
                    union(i,move1);
            if (isvalid(move2,arr.length))
                if( !isConnected(i,move2))
                    union(i,move2);
        }
        boolean flag = false;

        for(int goal : goals){
            if (isConnected(goal,start)) {
                flag = true;
                System.out.println("is connected : " + goal + " and " + start);
            }
        }
        return flag;
    }

    private void init(int n){
        parent = new int[n];
        height = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            height[i] = 1;
        }
    }

    private boolean isvalid(int move, int len){
        return move < len ;
    }

    private int find(int p) {
        int root = p;
        while ( root != getParent(root)){
            root = parent[root];
        }
        return root;
    }

    private int getParent(int i) {
        return parent[i];
    }

    public void union(int p, int q) {
        int i = find(p);
        int j = find(q);
        if ( i == j)
            return;
        if (height[i] < height[j]) {
            updateParent(i,j);
            updateHeight(j,i);
        } else {
            updateParent(j,i);
            updateHeight(i,j);
        }
    }

    private void updateParent(int p, int x) {
        parent[p] = x;
    }

    private void updateHeight(int p, int x) {
        height[p] += height[x];
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public static void main(String[] args) {
        int[] array = new int[] {3,0,2,1,2};
        int start = 2;

        M_Leetcode1306 test = new M_Leetcode1306();
        System.out.println(test.canReach(array,start));

    }
}

