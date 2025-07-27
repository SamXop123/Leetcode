class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

    
        while (l1 != null || l2 != null || carry != 0) {
            int value1 = 0;
            int value2 = 0;

            if (l1 != null) {
                value1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                value2 = l2.val;
                l2 = l2.next;
            }

            int total = value1 + value2 + carry;
            carry = total / 10;
            int digit = total % 10;

            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummy.next; 
    }
}
