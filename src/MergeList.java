/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeList {
    public static void main(String[] args) {
        ListNode l1 = new MyNodeList().init(new int[]{1, 3, 5});
        ListNode l2 = new MyNodeList().init(new int[]{2, 4, 6});
        ListNode result = merge(l1, l2);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

    public static ListNode merge(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return null;
        else if (list1 != null && list2 == null) return list1;
        else if (list1 == null && list2 != null) return list2;
        int val1 = list1.val; int val2 = list2.val;
        ListNode newList = null;
        ListNode current = null;
        if (val1 <= val2) {
            newList = new ListNode(val1);
            list1 = list1.next;
        }
        else {
            newList = new ListNode(val2);
            list2 = list2.next;
        }
        current = newList;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                current.next = list2;
                break;
            }
            if (list2 == null) {
                current.next = list1;
                break;
            }
            if (list1.val <= list2.val) {
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            current = current.next;
        }
        return newList;
    }
}
