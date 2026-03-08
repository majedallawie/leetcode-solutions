public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        ListNode post = head.next;
        while (post != null) {
            curr.next = pre;
            pre = curr;
            curr = post;
            post = curr.next; 
        }
        curr.next = pre;
        return curr;
    }
}
