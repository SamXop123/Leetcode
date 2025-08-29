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
    public int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;

        while(temp != null && temp.next != null) {
            int gcd = getGCD(temp.val, temp.next.val);
            ListNode newNode = new ListNode(gcd);
        
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }

        return head;
    }
}