class ListNode {
    char val;
    ListNode next;
    ListNode(char val) { this.val = val; }
}
public class PalindromeCheckerApp {
    public static ListNode addNode(ListNode head, char val) {
        if (head == null) return new ListNode(val);
        ListNode curr = head;
        while (curr.next != null) curr = curr.next;
        curr.next = new ListNode(val);
        return head;
    }
    public static ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverse(slow.next);
        slow.next = null;
        ListNode p1 = head, p2 = secondHalf;
        while (p1 != null && p2 != null) {
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1 == null && p2 == null;
    }
}