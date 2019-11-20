/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */

public class ReverseList {
    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        ListNode reversed = reverseList(list);
        while (reversed != null) {
            System.out.print(reversed.val+" ");
            reversed = reversed.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
