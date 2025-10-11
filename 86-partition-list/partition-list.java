/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode dummy1 = new ListNode(0);
        ListNode dummy2 = new ListNode(0);

        ListNode first = dummy1;
        ListNode second = dummy2;

        ListNode curr = head;
        while(curr != null) {
            
            if(curr.val >= x) {
                second.next = new ListNode(curr.val);
                second = second.next;
            }
            if(curr.val < x) {
                first.next = new ListNode(curr.val);
                first = first.next;
            }

            curr = curr.next;
        }

        
        first.next = dummy2.next;
        return dummy1.next;
    }
}