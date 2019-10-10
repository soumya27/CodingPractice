package InterviewPrep_HackerRank.linkedList;

public class LinkedListDemo {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    void printList(){
        Node n = head ;
        while (n!=null){
            System.out.print(n.data+ " ");
            n = n.next;
        }
    }

    void pushToFirst(Node newNode){
        newNode.next = head ;
        head = newNode;
    }

    void pushAfterNode(Node prev_node, int data){
        Node node = new Node(data);
        node.next = prev_node.next;
        prev_node.next = node;
    }

    void append(int data){

        Node node = new Node(data);
        // check if head is empty, ie empty list
        if( head == null){
            head = node;
            return;
        }
        // else traverse to last node
        node.next = null;
        Node last = head ;
        while (last.next != null){
            last= last.next;
        }
        last.next = node;
    }
    public static void main(String[] args) {
        LinkedListDemo llist = new LinkedListDemo();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;
        System.out.println("Printing initial list");
        llist.printList();
        llist.pushToFirst(new Node(10));
        System.out.println("\nAdding node to start of the list");
        llist.printList();
        llist.pushAfterNode(second,9);
        System.out.println("\nAdding node to after node 2 of the list");
        llist.printList();
        llist.append(15);
        System.out.println("\nAdding node to the end of the list");
        llist.printList();

    }
}
