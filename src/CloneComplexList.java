/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */

/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class CloneComplexList {
    public static void main(String[] args) {

    }

    /**
     *
     * @param pHead
     * @return
     * 1. 在旧链表中创建新链表，先不处理新链表的兄弟节点
     * 2. 根据旧链表的兄弟节点，初始化新链表的兄弟节点
     * 3. 从旧链表中拆分得到新链表
     *
     */
    public RandomListNode Clone(RandomListNode pHead)
    {
        if (pHead == null) return null;
        RandomListNode currentNode = pHead;
        // 1
        while (currentNode != null) {
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            RandomListNode nextNode = currentNode.next;
            currentNode.next = cloneNode;
            cloneNode.next = nextNode;
            currentNode = nextNode;
        }

        //2
        currentNode = pHead;
        while (currentNode != null) {
            currentNode.next.random = currentNode.random == null? null: currentNode.random.next;
            currentNode = currentNode.next.next;
        }

        //3
        currentNode = pHead;
        RandomListNode pCloneHead = pHead.next;
        while(currentNode != null) {
            RandomListNode cloneNode = currentNode.next;
            currentNode.next = cloneNode.next;
            cloneNode.next = currentNode.next == null? null: currentNode.next.next;
            currentNode = currentNode.next;
        }

        return pCloneHead;
    }
}
