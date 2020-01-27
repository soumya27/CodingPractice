//Link:https://www.hackerrank.com/challenges/is-binary-search-tree/problem
package HR_DataStructures.Trees;

import java.util.ArrayList;

public class M_IsBST {

//    this defined in the question
    public static class Node {
        int data;
        Node right;
        Node left;
        Node( int data){
            this.data = data;
            this.right = this.left = null;
        }
    }

// this is the code I added

    ArrayList<Integer> inorderList ;
    void inOrder(Node root){
        inorderList = new ArrayList<>();
        if (root == null) return;
        inOrder(root.left);
        inorderList.add(root.data);
        inOrder(root.right);
    }

    boolean checkBST(Node root) {
        inOrder(root);
        for(int i =0 ; i <inorderList.size()-1; i++){
            if(!(inorderList.get(i)<inorderList.get(i+1)))
                return false;
        }
        return true;
    }
 // till here
}
