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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }

        ListNode current = head;
        int i = 0;
        while (current != null) {
            current = head;
            for (int j = 0; j < i; j++) {
                current = current.next;
            }

            if(current.next == null) {
                break;
            }

            ListNode minNode = current;
            ListNode runner = current.next;
            while (runner != null) {
                if (runner.val < minNode.val) {
                    minNode = runner;
                }
                runner = runner.next;
            }

            int temp = current.val;
            current.val = minNode.val;
            minNode.val = temp;

            i++;
        }

        return head;
    }
}

