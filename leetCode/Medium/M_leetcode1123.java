package leetCode.Medium;


public class M_leetcode1123 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private static int maxDepth(TreeNode node){
        if (node == null) return 0;
        else {
            int ldepth = maxDepth(node.left);
            int rdepth = maxDepth(node.left);
            return (1+ Math.max(ldepth,rdepth));
        }
    }

    private static TreeNode lcaHelper (TreeNode node , int depth, int maxDepth){
        if (node == null)
            return null;
        TreeNode left = lcaHelper(node.left, depth+1,maxDepth);
        TreeNode right =  lcaHelper(node.right,depth+1,maxDepth);

        if (left == null && right == null )
            return (depth == maxDepth) ? node:null;

        if (left != null && right!= null)
            return null;

        if( left == null )
            return right;

        return left;
    }

    public static TreeNode lcaDeepestLeaves(TreeNode root) {
        int depth = maxDepth(root);
        System.out.println(depth);
        return lcaHelper(root,0,depth);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new  TreeNode(2);
        root.right = new  TreeNode(3);

        root.left.left = new  TreeNode(4);
        root.left.right = new  TreeNode(5);

        root.left.left.left = new  TreeNode(7);

        root.right.right = new  TreeNode(6);
        root.right.right.right = new  TreeNode(8);

        TreeNode n  = lcaDeepestLeaves(root);
    }
}
