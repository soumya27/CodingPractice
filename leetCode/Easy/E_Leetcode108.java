package leetCode.Easy;

public class E_Leetcode108 {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    private TreeNode createBST(int[] nums, int left, int right){
        if( left > right ){
            return null;
        }

        int mid = (left+right)/2;
        TreeNode result = new TreeNode(nums[mid]);
        if (left == right)
            return result;
        result.left = createBST(nums,left,mid-1);
        result.right = createBST(nums,mid+1,right);
        return result;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums,0,nums.length-1);
    }

    private void printInorder(TreeNode root){

        if( root == null)
            return ;
        printInorder(root.left);
        System.out.println( root.val);
        printInorder(root.right);
    }

    public static void main(String[] args) {
        E_Leetcode108 test = new E_Leetcode108();
        int[] input = new int[] {0,1,2,3,4,5};
        TreeNode root = test.sortedArrayToBST(input);
        test.printInorder(root);
    }
}
