package InterviewPrep_HackerRank.foobar;

import java.util.LinkedList;
import java.util.Queue;

public class Level2b {

    static class Node {
        int val;
        Node left, right;
        Node(int val){
            this.val = val;
        }
    }

    static int count=0;

    public static void setpostOrderValues(Node node ){
        if (node == null)
            return;
        setpostOrderValues(node.left);
        setpostOrderValues(node.right);
        node.val +=count;
        count++;
    }

    public static Node createTree(int h){
        Queue<Node> queue =new  LinkedList<>();
        int size = (int) Math.pow(2,h-1);
        Node root = new Node(1);
        queue.add(root);
        while (--size>0){
            Node node = queue.poll();
            assert node != null;
            node.left = new Node(1);
            node.right = new Node(1);
            queue.add(node.left);
            queue.add(node.right);
        }
        return root;
    }

    public static int findParent(Node root, int key){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.poll();
            if (node.left != null && node.right != null) {
                if (node.left.val == key || node.right.val == key)
                    return node.val;
                else {
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }
        return -1;
    }

    public static int[] solution(int h, int[] q) {
        Node root = createTree(h);
        setpostOrderValues(root);
        int[] result = new int[q.length];
        int i =0 ;
        for (int value : q){
            result[i++]= findParent(root,value);
        }
        return result;
    }

    public static void main(String[] args) {

        int[] keys = new int[] {19, 14, 28};
        for(int key : solution(5,keys)){
            System.out.println(key);
        }
    }
}
