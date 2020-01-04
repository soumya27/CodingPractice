package InterviewPrep_HackerRank.Trees;

class Node{

    int value;
    Node left, right;

    public Node(int value){
        this.value = value;
        left = right = null;
    }
}
public class BinaryTree {

    Node root;

    public BinaryTree(int value){
        root = new Node(value);
    }

    public BinaryTree(){
        root=null;
    }

    public Node createTree(){
        //inorder 3-10-4
        root = new Node(10);
        root.left = new Node(3);
        root.right = new Node(4);

        // inorder  7-3-10-4
        root.left.left = new Node(7);

        // inorder 7-3-10-12-4-2
        root.right.left = new Node(12);
        root.right.right = new Node(2);

        // inorder 7-3-10-12-4-1-2-6
        root.right.right.left = new Node(1);
        root.right.right.right = new Node(6);
        return root;
    }

    public void printInOder(Node node){
        if(node==null)
            return;
        printInOder(node.left);
        System.out.print(node.value+ " ");
        printInOder(node.right);
    }

    public void printPreOrder(Node node){
        if(node == null)
            return;
        System.out.print(node.value+ " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public void printPostOrder(Node node){
        if(node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.value+ " ");
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = binaryTree.createTree();
        System.out.println("inorder");
        binaryTree.printInOder(binaryTree.root);
        System.out.println("\npreorder");
        binaryTree.printPreOrder(binaryTree.root);
        System.out.println("\npostorder");
        binaryTree.printPostOrder(binaryTree.root);
    }
}
