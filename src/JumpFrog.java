/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 递归
 */
public class JumpFrog {
    public static void main(String[] args) {
        System.out.println(jumpFloor(2));
    }

    public static int jumpFloor(int target) {
        if (target == 0 || target == 1 || target == 2)
            return target;
        int num1 = 1; int num2 = 2;
        int result = 0;
        for (int i = 3; i <= target; i++) {
            result = num1 + num2;
            num1 = num2;
            num2 = result;
        }
        return result;
    }
}
