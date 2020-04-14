package leetCode.Easy;

public class E_Leetcode543 {

    public static int findMAaxDepth(TreeNode node){
        if (node == null)
            return 0;
        return Math.max(1+findMAaxDepth(node.left) ,1 +findMAaxDepth(node.right));
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        return findMAaxDepth(root.left)+ findMAaxDepth(root.right) ;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.left.right= new TreeNode(6);
        System.out.println(diameterOfBinaryTree(root));
    }
}
