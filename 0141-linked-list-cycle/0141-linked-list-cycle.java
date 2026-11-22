public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode a = head;
        ListNode b = head;

        while (b != null && b.next != null) {
            b = b.next.next;
            a = a.next;

            if (a == b) {
                return true;
            }
        }

        return false;
    }
}