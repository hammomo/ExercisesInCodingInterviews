/**
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
import java.util.ArrayList;
public class TreeTopToBottom {
    public static void main(String[] args) {
        TreeNode test = new TreeNode();
        test = test.generateTestTree();
        TreeTopToBottom curr = new TreeTopToBottom();
        curr.PrintFromTopToBottom(test).forEach(value -> System.out.print(value + " "));
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<TreeNode> tmp = new ArrayList<TreeNode>();
        if (root == null) return result;
        tmp.add(root);
        while(tmp.size() != 0) {
            TreeNode tree = tmp.remove(0);
            if (tree.left != null) {
                tmp.add(tree.left);
            }
            if (tree.right != null) {
                tmp.add(tree.right);
            }
            result.add(tree.val);
        }
        return result;
    }
}
