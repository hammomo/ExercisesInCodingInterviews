/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * 前序遍历：根结点 ---> 左子树 ---> 右子树
 * 中序遍历：左子树---> 根结点 ---> 右子树
 */
public class ConstructBinaryTree {
    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
//        int[] test = new int[-1];
        TreeNode tree = reConstructBinaryTree(pre, in);
//        System.out.println();
        tree.preOrder(tree);
        System.out.println();
        tree.inOrder(tree);
    }

    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null)
            return null;
        TreeNode tree = new TreeNode(pre[0]);
        tree.left = null;
        tree.right = null;
        int totalLength = in.length;
        int leftLength = 0;
        for (int i = 0; i < totalLength; i++) {
            if (in[i] == pre[0])
                break;
            leftLength++;
        }
        int rightLength = totalLength - leftLength - 1;
        if (leftLength > 0) {
            int[] inLeftArr = new int[leftLength];
            int[] preLeftArr = new int[leftLength];
            for (int i = 0; i < leftLength; i++) {
                inLeftArr[i] = in[i];
                preLeftArr[i] = pre[i+1];
            }
            tree.left = reConstructBinaryTree(preLeftArr, inLeftArr);
        }
        if (rightLength > 0) {
            int[] inRightArr = new int[rightLength];
            int[] preRightArr = new int[rightLength];
            for(int i = 0; i < rightLength; i ++) {
                int idx = totalLength - rightLength + i;
                if (idx == totalLength)
                    break;
                inRightArr[i] = in[idx];
                preRightArr[i] = pre[idx];
            }
            tree.right = reConstructBinaryTree(preRightArr, inRightArr);
        }
        return tree;
    }
}
