//https://leetcode.com/problems/maximum-width-of-binary-tree/
package leetCode.Medium;


import java.util.LinkedList;
import java.util.Queue;

public class M_Leetcode662 {

    public static class TreeNode {
        int val;
//        int level ;
//        int pos;
        TreeNode left;
        TreeNode right;
        TreeNode (int val){
            this.val = val;
        }
    }

    public static  class NodeDetails{
        int level, pos;
        TreeNode node;
        NodeDetails (TreeNode node, int level, int pos){
            this.node = node;
            this.level = level;
            this.pos = pos;
        }
    }
    public static int widthOfBinaryTree(TreeNode root) {
        if( root == null)
            return 0;
        Queue<NodeDetails> queue = new LinkedList<>();
        NodeDetails rootNode = new NodeDetails(root, 1,1);
        int current =1, left =0, max =0;
        queue.add(rootNode);
        while(!queue.isEmpty()){
            NodeDetails node = queue.poll();
            if( node.node.left != null) {
                queue.add(new NodeDetails(node.node.left,node.level+1, node.pos*2));
            }
            if(node.node.right!= null) {
                queue.add(new NodeDetails(node.node.right,node.level+1, node.pos*2+1));
            }
            if( current != node.level){
                current = node.level;
                left = node.pos;
            }
            max = Math.max(max, node.pos - left +1);
        }
        return max;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(6);

        root.right = new TreeNode(2);
        root.right.right = new TreeNode(9);
        root.right.right.right = new TreeNode(7);

        System.out.println(widthOfBinaryTree(root));
    }
}
