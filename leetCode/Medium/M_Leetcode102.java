package leetCode.Medium;

import java.util.*;

public class M_Leetcode102 {

//    static  result = new ArrayList<>();

    public static List<List<Integer>> levelOrder(M_DepthFirstSearch1302.TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return null ;
        Queue<M_DepthFirstSearch1302.TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(true){
            int nodeCount = queue.size();
            if (nodeCount == 0)
                break;
            List<Integer> level = new ArrayList<>();
            while (nodeCount>0){
                M_DepthFirstSearch1302.TreeNode node = queue.peek();
                System.out.print( node.val + " ");
                level.add(node.val);
                queue.remove();
                if (node.left != null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                nodeCount--;
            }
            System.out.println();
            result.add(level);
        }
        System.out.println(result.get(result.size()-1).get(0));
        return result;
    }
    public static void main(String[] args) {
        M_DepthFirstSearch1302.TreeNode root = new M_DepthFirstSearch1302.TreeNode(3);
        root.left = new M_DepthFirstSearch1302.TreeNode(9);
        root.right = new M_DepthFirstSearch1302.TreeNode(20);
        root.right.left = new M_DepthFirstSearch1302.TreeNode(15);
        root.right.right = new M_DepthFirstSearch1302.TreeNode(7);

        System.out.println(Arrays.toString(levelOrder(root).toArray()));
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
//class Solution {
//    public List<List<Integer>> levelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null)
//            return result;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//
//        while(true){
//            int nodeCount = queue.size();
//            if (nodeCount == 0)
//                break;
//            List<Integer> level = new ArrayList<>();
//            while (nodeCount>0){
//                TreeNode node = queue.peek();
//                level.add(node.val);
//                queue.remove();
//                if (node.left != null){
//                    queue.add(node.left);
//                }
//                if(node.right!=null){
//                    queue.add(node.right);
//                }
//                nodeCount--;
//            }
//            result.add(level);
//        }
//        return result;
//    }
//}
