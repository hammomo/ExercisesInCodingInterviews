import java.util.Stack;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    TreeNode() {}

    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        tree = tree.generateTestTree();

        System.out.println("Recursion Version of PreOrder Traversal:");
        tree.recursionPreOrder(tree);
        System.out.println("\nNon-Recursion Version of PreOrder Traversal:");
        tree.nonRecursionPreOrder(tree);
        System.out.println("\nRecursion Version of InOrder Traversal:");
        tree.recursionInOrder(tree);
        System.out.println("\nNon-Recursion Version of InOrder Traversal:");
        tree.nonRecursionInOrder(tree);
        System.out.println("\nRecursion Version of PostOrder Traversal:");
        tree.recursionPostOrder(tree);
        System.out.println("\nNon-Recursion Version of PostOrder Traversal:");
        tree.nonRecursionPostOrder(tree);
    }

    public TreeNode generateTestTree() {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.left.right = new TreeNode(6);
        tree.left.left.right.left = new TreeNode(7);
        tree.left.left.right.right = new TreeNode(8);
        tree.right.right = new TreeNode(5);

        return tree;
    }

    public void recursionPreOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            recursionPreOrder(root.left);
            recursionPreOrder(root.right);
        }
    }

    public void nonRecursionPreOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                System.out.print(node.val + " ");
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()) {
                node = stack.pop();
                node = node.right;
            }
        }
    }

    public void recursionInOrder(TreeNode root) {
        if (root != null) {
            recursionInOrder(root.left);
            System.out.print(root.val + " ");
            recursionInOrder(root.right);
        }
    }

    public void nonRecursionInOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()) {
                node = stack.pop();
                System.out.print(node.val + " ");
                node = node.right;
            }
        }
    }

    public void recursionPostOrder(TreeNode root) {
        if (root != null) {
            recursionPostOrder(root.left);
            recursionPostOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    public void nonRecursionPostOrder(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        TreeNode lastVisit = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.peek();
            if (node.right == null || node.right == lastVisit) {
                System.out.print(node.val + " ");
                stack.pop();
                lastVisit = node;
                node = null;
            } else {
                 node = node.right;
            }
        }
    }

}
