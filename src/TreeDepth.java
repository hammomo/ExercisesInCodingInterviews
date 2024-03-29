/**
 * 输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */
public class TreeDepth {
    public int TreeDepth(TreeNode root) {
        // copy from NewCoder. TBH, this solution is amazing
        return root == null? 0: Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
    }
}