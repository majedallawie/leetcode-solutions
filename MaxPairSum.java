public class MaxPairSum {
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int length = 0;
        while(temp != null) {
            length++;
            temp = temp.next;
        }
        int[] sumArr = new int[length / 2];
        temp = head;
        for (int i = 0; i < sumArr.length; i++) {
            sumArr[i] = temp.val;
            temp = temp.next;
        }
        for (int i = sumArr.length - 1; i >= 0; i--) {
            sumArr[i] += temp.val;
            temp = temp.next;
        }
        int max = 0;
        for(int i : sumArr)
            max = Math.max(max, i);
        return max;
    }
}
