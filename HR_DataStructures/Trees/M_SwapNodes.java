//link:https://www.hackerrank.com/challenges/swap-nodes-algo/problem
package HR_DataStructures.Trees;

import java.util.ArrayList;

public class M_SwapNodes {

    static class Node {
        int data;
        Node left;
        Node right;
        Node (int data){
            this.data = data;
            this.right = this.left = null;
        }
    }

    private static void inOrder(Node root){
        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data+ " ");
        inOrder(root.right);
    }

    private static void dfs(Node node, int h){
        if(node == null)
            return;
        depth[h].add(node.data);
        dfs(node.left, h+1);
        dfs(node.right, h+1);
    }

    private static ArrayList<Integer>[] depth;

    private static void swapNodes(int[][] indexes, int[] queries) {
        int n = indexes.length;
        Node[] tree = new Node[n + 1];
        depth = new ArrayList[n+1];

        for(int i = 1; i <= n; i++) {
            tree[i] = new Node(i);
            depth[i]= new ArrayList<>();
        }

        for(int i = 0 ; i < n; i++){
            int l = indexes[i][0];
            int r = indexes[i][1];
            if (l !=-1){
                tree[i+1].left = tree[l];
            }
            if( r!= -1 ){
                tree[i+1].right = tree[r];
            }
        }

        for (int i = 1; i <= n ; i ++){
            Node node = tree[i];
            int left = -1 ;
            int right =-1;

            if (node.left != null) {
                left = node.left.data;
            }
            if (node.right != null) {
                right = node.right.data;
            }
            System.out.println(node.data + " " + left + " " + right);
        }

        dfs(tree[1], 1);

        for (int query : queries) {
            int h = query;
            while (h <= n) {
                for (int d : depth[h]) {
                    Node temp = tree[d].left;
                    tree[d].left = tree[d].right;
                    tree[d].right = temp;
                }
                h += query;
            }
            inOrder(tree[1]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] indexes = new int[][] {
                {2,3},{4,-1},{5,-1},{6,-1},{7,8},
                {-1,9},{-1,-1},{10,11},{-1,-1},{-1,-1},
                {-1,-1}
        };
        int[] queries = new int[] {2,4};

        swapNodes(indexes,queries);
    }
}
