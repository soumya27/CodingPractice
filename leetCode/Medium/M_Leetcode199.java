//Link:https://leetcode.com/problems/binary-tree-right-side-view/
package leetCode.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class M_Leetcode199 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> rightSideView(M_DepthFirstSearch1302.TreeNode root) {
        if(root == null ){ // exit condition
            return result;
        }
        Queue<M_DepthFirstSearch1302.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(true){
            int nodeCount = queue.size();
            if( nodeCount == 0 )
                break;
            boolean rightmost = true;
            while (nodeCount > 0){
                M_DepthFirstSearch1302.TreeNode node = queue.peek();
                if(rightmost) {
                    result.add(node.val);
                    rightmost = false;
                }
                queue.remove();
                if(node.right!=null)
                    queue.add(node.right);
                if( node.left!= null)
                    queue.add(node.left);
                nodeCount--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        M_DepthFirstSearch1302.TreeNode root = new M_DepthFirstSearch1302.TreeNode(1);
        root.left = new M_DepthFirstSearch1302.TreeNode(2);
//        root.right = new M_DepthFirstSearch1302.TreeNode(3);
//        root.left.right = new M_DepthFirstSearch1302.TreeNode(5);
//        root.right.right = new M_DepthFirstSearch1302.TreeNode(4);


        for(int value : new M_Leetcode199().rightSideView(root)){
            System.out.println(value);
        }
    }
}
