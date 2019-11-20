/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKInList {
    public static void main(String[] args) {
        ListNode list = new ListNode(0);
        System.out.println(findKthToTail(list, 3).val);
    }

    public static ListNode findKthToTail(ListNode head, int k) {
        ListNode p1 = head; ListNode p2 = head;
        int a = k;
        int count = 0;
        while (p1 != null) {
            p1 = p1.next;
            count++;
            if (k <= 0) {
                p2 = p2.next;
            }
            k--;
        }
        if (a > count) return null;
        return p2;
    }
}
