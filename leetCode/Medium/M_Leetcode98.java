package leetCode.Medium;

import java.util.ArrayList;

public class M_Leetcode98 {

//    > Method 1 : check inOrder
//    ArrayList<Integer> inorderList= new ArrayList<>();;
//    void inOrder(M_DepthFirstSearch1302.TreeNode root){
//        if (root == null) return;
//        inOrder(root.left);
//        inorderList.add(root.val);
//        inOrder(root.right);
//    }
//
//    public boolean isValidBST(M_DepthFirstSearch1302.TreeNode root) {
//        inOrder(root);
//        for(int i =0 ; i <inorderList.size()-1; i++){
//            if(!(inorderList.get(i)<inorderList.get(i+1)))
//                return false;
//        }
//        return true;
//    }

    private boolean isBST(M_DepthFirstSearch1302.TreeNode node, int min, int max){
        if (node == null)
            return true;
        if (node.val < min || node.val > max)
            return false;
        return (isBST(node.left, min, node.val-1) && isBST(node.right, node.val+1, max));
    }

    public boolean isValidBST(M_DepthFirstSearch1302.TreeNode root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}
