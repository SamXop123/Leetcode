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
    public static int getGCD(int a, int b) {
        while(b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;

        while(temp.next != null) {
            ListNode newNode = new ListNode();

            newNode.val = getGCD(temp.val, temp.next.val);
            
            newNode.next = temp.next;
            temp.next = newNode;
            temp = temp.next.next;
        }

        return head;
    }
}