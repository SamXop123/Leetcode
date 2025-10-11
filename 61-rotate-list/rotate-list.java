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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }
        
        int length = 1;
        ListNode curr = head;
        while(curr.next != null) {
            length++;
            curr = curr.next;
        }

        curr.next = head;
        k = k % length;

        int i = length-k-1;
        while(i >= 0) {
            curr = curr.next;
            i--;
        }

        ListNode newHead = curr.next;
        curr.next = null;

        return newHead;
    }
}