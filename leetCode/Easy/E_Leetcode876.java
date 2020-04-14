package leetCode.Easy;

public class E_Leetcode876 {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
  public static ListNode middleNode(ListNode head) {
        ListNode slowPointer = head ;
        ListNode fastPointer = head;
        while (fastPointer.next != null){
            // increment slow
            slowPointer = slowPointer.next;

            //increment fast
            fastPointer = fastPointer.next.next;
            if (fastPointer == null)
                return slowPointer;
        }
        return slowPointer;
  }

    public static void main(String[] args) {
//        1,2,3,4,5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode middle = middleNode(head);
        System.out.println(middle.val);
    }
}
