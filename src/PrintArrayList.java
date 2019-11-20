import java.util.ArrayList;
/*
输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class PrintArrayList {
    public static void main(String[] args) {
        ListNode ll = new ListNode(3);
        ll.next = new ListNode(7);
        ll.next.next = new ListNode(10);
        for (int i : printListFromTailToHead(ll)) {
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> re = new ArrayList<Integer>();
        try {
            do {
                re.add(0, listNode.val);
                listNode = listNode.next;
            } while (listNode != null);
            return re;
        } catch (Exception e) {
            return new ArrayList<Integer>();
        }

    }
}