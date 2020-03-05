package leetCode.Medium;

public class M_Leetcode513 {

    int maxLevel = 0;
    int val =0;

    public int findBottomLeftValue(M_DepthFirstSearch1302.TreeNode root) {
        computeTree(root,0);
        return this.val;
    }


    private void computeTree(M_DepthFirstSearch1302.TreeNode root, int level){
        if(root!= null){
            if( level >= this.maxLevel){
                this.maxLevel =level;
                this.val =root.val;
            }
            computeTree(root.right, level+1);
            computeTree(root.left,level+1);
        }
    }

    public static void main(String[] args) {
        M_DepthFirstSearch1302.TreeNode root = new M_DepthFirstSearch1302.TreeNode(3);
        root.left = new M_DepthFirstSearch1302.TreeNode(9);
        root.right = new M_DepthFirstSearch1302.TreeNode(20);
        root.right.left = new M_DepthFirstSearch1302.TreeNode(15);
        root.right.right = new M_DepthFirstSearch1302.TreeNode(7);

        M_Leetcode513 test = new M_Leetcode513();
        System.out.println(test.findBottomLeftValue(root));
    }
}
