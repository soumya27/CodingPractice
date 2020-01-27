package HR_DataStructures.Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class P_IsBST {

    private static class Node {
        int data;
        Node right;
        Node left;
        Node (int data){
            this.data = data;
            this.right = this.left = null;
        }
    }

    private static Node root = null;

    private static void createBST(int[] input){
        for(int value : input) {
            root = insert(root, value);
        }
        inOrder(root);
        if(checkBST()){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static Node insert (Node root, int value){

        if (root == null){
            root = new Node(value);
            return root;
         }

        if ( value <root.data){
            root.left = insert(root.left,value);
        } else if ( value > root.data){
            root.right = insert(root.right,value);
        }
        return root;
    }

    private static void inOrder (Node root){
        inorderList = new ArrayList<>();
        if (root == null ) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inorderList.add(root.data);
        inOrder(root.right);
    }

    private static ArrayList<Integer> inorderList;

    private static boolean checkBST() {
        for (int i = 0; i < inorderList.size()-1;i++){
            if(!(inorderList.get(i)<inorderList.get(i+1))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] input = new int[] {3,5,1,4,6,2,7,8};
        createBST(input);

    }
}
