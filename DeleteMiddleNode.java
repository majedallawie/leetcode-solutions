class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DeleteMiddleNode {
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if (length <= 1)
            return null;
        ListNode prev = head;
        temp = head;
        for (int i = 0; i < length / 2; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }
}