package HR_DataStructures.Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class P_SwapNodes {

    private static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.right = this.left= null;
        }
    }
    private static class Pair{
        int i;
        Node node;
        Pair (Node node, int i){
            this.node = node;
            this.i = i;
        }
    }

    private static void depthValues(Node root){
        if( root == null)
            return;
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root,1));
        Pair p;
        while (!queue.isEmpty()){
            p = queue.peek();
            queue.remove();

            System.out.println(" Level : " +p.i + " Node : "+p.node.data);
            if (p.node.left != null) {
                queue.add(new Pair (p.node.left,p.i+1));
            }
            if(p.node.right != null) {
                queue.add(new Pair(p.node.right, p.i+1));
            }
        }
    }

    public static void main(String[] args) {
        //        1
        //       / \
        //      2   3
        //       \   \
        //        4   5
        Node root = new Node(1);
        root.left = new Node (2);
        root.right = new Node(3);

        root.left.right = new Node(4);
        root.right.right = new Node(5);
        depthValues(root);
    }
}
