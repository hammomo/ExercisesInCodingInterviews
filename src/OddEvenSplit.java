/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 插入排序
 */
public class OddEvenSplit {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 0, 7, 10, 3, 15};
        reOrderArray(arr);
        for (int i: arr)
            System.out.print(i + " ");
    }

    public static void reOrderArray(int[] array) {
        int length = array.length;
        int k = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] % 2 == 1) {
                int j = i;
                while (j > k) {
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    j--;
                }
                k++;
            }
        }
    }
}
