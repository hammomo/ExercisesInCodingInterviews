/**
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class TreeToDoubleLinkedList {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        tree = tree.generateTestTree();
        System.out.println("\nRecursion Version of InOrder Traversal:");
        tree.recursionInOrder(tree);

        System.out.println("\nLinked list from left to right:");
        TreeToDoubleLinkedList list = new TreeToDoubleLinkedList();
        TreeNode another = list.Convert(tree);
        while(another != null) {
            System.out.print(another.val + " ");
            another = another.right;
        }
    }
    TreeNode head = null;
    TreeNode readHead = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        convertSub(pRootOfTree);
        return readHead;
    }

    // in order traversal
    public void convertSub(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return;
        convertSub(pRootOfTree.left);
        if (head == null) {
            head = pRootOfTree;
            readHead = pRootOfTree;
        } else {
            // pRootOfTree travels one node faster than head, so head is left than pRootOfTree
            head.right = pRootOfTree;
            pRootOfTree.left = head;
            head = pRootOfTree;
        }
        convertSub(pRootOfTree.right);
    }
}
