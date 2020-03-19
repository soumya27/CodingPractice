//https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/
package leetCode.contest;

public class M_Biweekly_1372 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int val){
            this.val = val;
        }
    }

    int maxStep = 0;
    public int longestZigZag(TreeNode root) {
        dfs(root, true, 0);
        dfs(root, false, 0);
        return maxStep;
    }
    private void dfs(TreeNode root, boolean isLeft, int step) {
        if (root == null) return;
        maxStep = Math.max(maxStep, step);
        if (isLeft) {
            dfs(root.left, false, step + 1);
            dfs(root.right, true, 1);
        } else {
            dfs(root.right, true, step + 1);
            dfs(root.left, false, 1);
        }
    }

    public static void main(String[] args) {
        M_Biweekly_1372 test = new M_Biweekly_1372();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left= new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);

        System.out.println(test.longestZigZag(root));
    }
}
