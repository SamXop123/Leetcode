class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode original = head;
        ListNode current = head;
        int idx = 1;

        ListNode odd = new ListNode(0);
        ListNode oddTail = odd;

        while (current != null && current.next != null) {
            if (idx % 2 == 1) {
                ListNode evenNode = current.next;
                current.next = current.next.next;

                oddTail.next = evenNode;
                oddTail = oddTail.next;
                oddTail.next = null; 
            } else {
                current = current.next;
            }
            idx++;
        }

        current = original;
        while (current.next != null) {
            current = current.next;
        }
        current.next = odd.next;

        return original;
    }
}