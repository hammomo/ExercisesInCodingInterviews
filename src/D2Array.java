/**
* 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
* 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class D2Array {
    public static void main(String[] args) {
        int[][] test = {{1, 4, 9}, {2, 5, 11}, {4, 7, 20}};
        int[][] test2 = {{}};
        System.out.println(Find(16, test2));
    }

    public static boolean Find(int target, int[][] array) {
        boolean re = false;
        try {
            for (int[] arr : array) {
                if (arr[0] > target)
                    break;
                if (arr[arr.length-1] < target)
                    continue;
                for (int i : arr) {
                    if (i == target) {
                        re = true;
                        break;
                    }
                }
                if (re)
                    break;
            }
            return re;
        } catch (Exception e) {
            return false;
        }
    }
}
