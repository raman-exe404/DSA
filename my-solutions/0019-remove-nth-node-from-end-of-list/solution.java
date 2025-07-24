

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        // Step 1: Count size
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        // Step 2: Find position to skip
        int skipIndex = size - n;

        // Step 3: Use dummy to build new list
        ListNode dummy = new ListNode(0); // dummy head
        ListNode current = dummy;
        int index = 0;
        temp = head;

        while (temp != null) {
            if (index != skipIndex) {
                current.next = new ListNode(temp.val);
                current = current.next;
            }
            temp = temp.next;
            index++;
        }

        return dummy.next;
    }
}

