package leetCode.Medium;
//link: https://leetcode.com/problems/add-two-numbers/
import org.w3c.dom.ls.LSException;

public class AddTwoLL {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public static void sum(ListNode p, ListNode q, ListNode current , int carry){

        if(p == null && q ==null){
            if(carry >0 )
                current.next = new ListNode(carry);
            return;
        }
        int x = p == null ? 0: p.val;
        int y = q== null? 0: q.val;
        int sum = x+y+carry;
        carry = sum /10;
        current.next = new ListNode(sum%10);
        current = current.next;
        sum(( p == null ? null : p.next), (q == null ? null : q.next),current,carry);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode head = new ListNode(0);
       ListNode p =l1, q =l2 ,current = head;
       int carry=0;
//       while (p!=null || q !=null){
//           int x = p!=null?p.val : 0;
//           int y = q!=null ? q.val: 0;
//           int sum = x+y+carry;
//           carry = sum/10;
//           current.next = new ListNode(sum%10);
//           current = current.next;
//           if(p !=null) p = p.next;
//           if(q!= null) q= q.next;
//       }
//        if (carry>0) {
//            current.next = new ListNode(carry);
//        }
//        return head.next;
        sum(p,q,current,carry);
        return head.next;
    }

    public static void main(String[] args) {
        ListNode p = new ListNode(3);
        ListNode l1= p;
        l1.next = new ListNode(5);
        l1 = l1.next;
        l1.next = new ListNode(2);
        l1 = l1.next;

        ListNode q = new ListNode(2);
        ListNode l2 = q;


        addTwoNumbers(p,q);
    }
}
