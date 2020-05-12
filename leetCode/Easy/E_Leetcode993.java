//Link:https://leetcode.com/problems/cousins-in-binary-tree/
package leetCode.Easy;

import java.util.HashMap;

public class E_Leetcode993 {

    static HashMap<Integer,Integer> nodeDepths = new HashMap<>();

    public static void dfs(TreeNode node , int depth){
        if (node == null) return;
        nodeDepths.put(node.val, depth);
        dfs(node.left,depth+1);
        dfs(node.right,depth+1);
    }
    public static boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,0);
        return nodeDepths.get(x).equals(nodeDepths.get(y));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(5);

        System.out.println(isCousins(root,5,4));

    }

}
