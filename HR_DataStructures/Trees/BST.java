package HR_DataStructures.Trees;

public class BST {

    private static Node root;

    private static class Node {
        int value;
        int key;
        Node left;
        Node right;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    public static void put(int key ,int value){
        root = put(root,key,value);
    }

    public static Node put(Node x,int key, int value){
        if ( x == null )
            x = new Node(key,value);
        else {
            if(key < x.key)
                x.left = put(x.left, key, value);
            else if (key > x.key)
                x.right = put(x.right, key, value);
            else
                x.value = value;
        }
        return x;
    }

    public static int get(int key){
        Node x = root;
        while (x!=null){
            if (key < x.key)
                x = x.left;
            else if (key > x.key)
                x = x.right;
            else
                return x.value;
        }
        return -1;
    }

    public static int floor(int key){
        Node x = floor(root, key);
        if (x == null)
            return -1;
        return x.key;
    }

    public static Node floor (Node x, int key){
        if (x == null)
            return null;
        if (key == x.key)
            return x;
        if (key < x.key)
            return floor (x.left, key);
        Node t = floor (x.right,key);
        if (t!= null)
            return t;
        else
            return x;
    }

    public static int ceiling(int key){
        Node x = ceiling(root , key);
        if (x == null )
            return -1;
        return x.key;
    }


    public static Node ceiling (Node x , int key ){
        if (x == null)
            return null;
        if (key == x.key)
            return x;
        if ( key > x.key)
            return ceiling(x.right, key);
        Node t = ceiling(x.left,key);
        if (t!=null)
            return t;
        else
            return x;
    }

    public static void deleteMin(){
        root = deleteMin(root);
    }

    public static Node deleteMin(Node x){
        if (x.left == null)
            return x.right;
        x.left = deleteMin(x.left);
        //x.count= 1+ size(x.left) + size(x.right);
        return x;
    }

    //hibbard deletion
    public static void delete(int key){
        root = delete(root, key);
    }

    public static Node delete(Node x, int key ){
        if (x ==null)
            return null;
        if ( key < x.key){
            x.left = delete(x.left,key);
        } else if ( key > x.key){
            x.right = delete(x.right,key);
        }else {
            if (x.right == null)
                return x.left;
            if (x.left == null)
                return  x.right;

//            Node t = x;
//            x = min(t.right);
//            x.right =deleteMin(t.right);
//            x.left = t.left;
        }
//        x.count = size(x.right)+ size(x.left)+1;
        return x;
    }

    public static void main(String[] args) {
        put(1,10);
        put(2,20);
        System.out.println(get(2));
        put(2,30);
        System.out.println(get(2));
        System.out.println(floor(3));
        put(5,90);
        System.out.println(ceiling(4));
    }
}
