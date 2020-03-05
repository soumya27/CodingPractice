package leetCode.Medium;

public class M_DepthFirstSearch1302 {

    int depth;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private static int maxdepth(TreeNode node){
        if (node == null)
            return 0;
        return 1+ Math.max(maxdepth(node.left),maxdepth(node.right));
    }

    private static int sumMaxDepthLevel(TreeNode node, int max){
        if (node == null) return 0;
        if (max ==1 ) return node.val;
        return (sumMaxDepthLevel(node.left, max-1) + sumMaxDepthLevel(node.right, max-1));
    }


    public static int deepestLeavesSum(TreeNode root) {
        int depth = maxdepth(root);
        return sumMaxDepthLevel(root,depth);
    }

    public static void main (String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.left.left.left = new TreeNode(7);

        root.right.right = new TreeNode(6);
        root.right.right.right = new TreeNode(8);

        System.out.println(deepestLeavesSum(root));
    }
}
