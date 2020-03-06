//Link:https://leetcode.com/problems/minimum-distance-between-bst-nodes/
package leetCode.Medium;

import java.util.ArrayList;
import java.util.List;

public class M_Leetcode783 {

    private static class TreeNode {
        int val ;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    List<Integer> bstArray = new ArrayList<>();

    private void createArray (TreeNode root){
        if( root == null)
            return ;
        createArray(root.left);
        bstArray.add(root.val);
        createArray(root.right);
    }

    public int minDiffInBST(TreeNode root) {
        //Inorder --> array ( sorted )
        createArray(root);
        int min = Integer.MAX_VALUE;
        for(int i = 1 ; i <bstArray.size(); i++){
            min = Math.min(min, Math.subtractExact(bstArray.get(i),bstArray.get(i-1)));
        }
        return min;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        System.out.println(new M_Leetcode783().minDiffInBST(root));
    }
}
