/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(4));
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        int num1 = 0; int num2 = 1;
        int currentNum = 0;
        for (int i = 2; i <= n; i++) {
            currentNum = num1 + num2;
            num1 = num2;
            num2 = currentNum;
        }
        return currentNum;
    }
}
