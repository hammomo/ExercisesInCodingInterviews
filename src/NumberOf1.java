/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class NumberOf1 {
    public static void main(String[] args) {
        System.out.println(numberOf1(-3));
        System.out.println(numberOf1(-3));
    }

    public static int numberOf1(int n) {
        return Integer.bitCount(n);
    }

    public static int numberOf1Good(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n-1) & n;
        }
        return count;
    }
}
