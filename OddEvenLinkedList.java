public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode evenHead = head.next;
        ListNode even = evenHead;
        ListNode odd = head;
        while (odd.next != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
