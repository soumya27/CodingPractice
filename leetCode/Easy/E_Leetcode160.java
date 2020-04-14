//Link:https://leetcode.com/problems/intersection-of-two-linked-lists/
package leetCode.Easy;
public class E_Leetcode160 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public int findLength(ListNode head){
        ListNode current = head;
        int len =0;
        while (current != null){
            current = current.next;
            len++;
        }
        return len;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // find Len1
        int len1 = findLength(headA);
        // find Len2
        int len2 = findLength(headB);

        // find diff
        // start from diff for longer Len
        if (len2> len1){
            int diff = len2- len1;
            // move till diff
            while (diff != 0 ){
                headB = headB.next;
                diff--;
            }
        }else {
            int diff = len1- len2;
            while (diff != 0 ){
                headA = headA.next;
                diff--;
            }
        }

        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
