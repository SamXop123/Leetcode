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
    public ListNode mergeKLists(ListNode[] lists) {
        
        ListNode merged = new ListNode(0);

        for(ListNode curr : lists) {
            ListNode temp = curr;
            
            while(temp != null) {
                ListNode node = new ListNode(temp.val);
                ListNode prev = merged;
                
                while (prev.next != null && prev.next.val < node.val) {
                    prev = prev.next;
                }
                node.next = prev.next;
                prev.next = node;
                temp = temp.next;
            }
        }
        return merged.next;
    }
}