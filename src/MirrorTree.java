import apple.laf.JRSUIUtils;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class MirrorTree {
    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode tree1 = ConstructBinaryTree.reConstructBinaryTree(pre, in);
        Mirror(tree1);
        tree1.preOrder(tree1);
        tree1.inOrder(tree1);
    }

    public static void Mirror(TreeNode root) {
        if (root == null) return;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if (root.left != null) {
            Mirror(root.left);
        }
        if (root.right != null) {
            Mirror(root.right);
        }
    }
}
