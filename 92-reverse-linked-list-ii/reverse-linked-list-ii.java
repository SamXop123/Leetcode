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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head == null || head.next == null || left == right) {
            return head;
        }

        ListNode firstPart = head;
        ListNode prev = null;

        for (int i = 1; i < left; i++) {
            prev = firstPart;
            firstPart = firstPart.next;
        }

        ListNode start = firstPart;
        ListNode current = start.next;
        ListNode nextNode = null;

        for (int i = left; i < right; i++) {
            nextNode = current.next;
            current.next = start;

            start = current;
            current = nextNode;
        }

        if (prev != null) {
            prev.next = start;
        } else {
            head = start;
        }

        firstPart.next = current;
       
        return head;
    }
}