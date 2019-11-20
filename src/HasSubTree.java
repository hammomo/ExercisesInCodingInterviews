/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubTree {
    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode tree1 = ConstructBinaryTree.reConstructBinaryTree(pre, in);
        int[] pre1 = {4,7};
        int[] in1 = {4,7};
        TreeNode tree2 = ConstructBinaryTree.reConstructBinaryTree(pre1, in1);
        HasSubTree hst = new HasSubTree();
        boolean result = hst.HasSubTree(tree1, tree2);
        System.out.println(result);
    }

    public boolean HasSubTree(TreeNode root1, TreeNode root2) {
        boolean result = false;
        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                result = isSubTree(root1, root2);
            }
            if (!result) {
                result = HasSubTree(root1.left, root2);
            }
            if (!result) {
                result = HasSubTree(root1.right, root2);
            }
        }
        return result;
    }

    public boolean isSubTree(TreeNode node1, TreeNode node2) {
        if (node2 == null) return true;
        if (node1 == null) return false;
        if (node1.val != node2.val) return false;
        return isSubTree(node1.left, node2.left) && isSubTree(node1.right, node2.right);
    }
}
