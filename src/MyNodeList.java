/**
 * Initialise Node List
 */
public class MyNodeList {
    public ListNode head;
    public ListNode current;

    public void add(int data) {
        if (head == null) {
            head = new ListNode(data);
            current = head;
        } else {
            current.next = new ListNode(data);
            current = current.next;
        }
    }

    public ListNode init(int[] arr) {
        for (int i: arr) {
            this.add(i);
        }
        return head;
    }
}
