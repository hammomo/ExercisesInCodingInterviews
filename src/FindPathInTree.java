/**
 * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 * (注意: 在返回值的list中，数组长度大的数组靠前)
 */
import java.util.ArrayList;

public class FindPathInTree {


    public static void main(String[] args) {
        int[] pre = {10,5,4,7,12};
        int[] in = {4,5,7,10,12};
        TreeNode tree = ConstructBinaryTree.reConstructBinaryTree(pre, in);
        FindPathInTree test = new FindPathInTree();
        ArrayList<ArrayList<Integer>> result = test.FindPath(tree, 15);
        result.forEach(value -> {
            value.forEach(i -> System.out.print(i + " "));
            System.out.println();
        });
    }

    ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list = new ArrayList<Integer>();

    // Recursion function
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if (root == null) return listAll;
        list.add(root.val);
        target -= root.val;

        if (target == 0 && root.left == null && root.right ==null) listAll.add(new ArrayList<Integer>(list));
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size() - 1); //???
        return listAll;
    }
}
