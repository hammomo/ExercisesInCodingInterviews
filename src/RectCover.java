/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class RectCover {
    public int rectCover(int target) {
        if (target == 1 || target == 2)
            return target;
        int num1 = 1; int num2 = 2;
        int re = 0;
        for (int i = 3; i<= target; i++) {
            re = num1 + num2;
            num1 = num2;
            num2 = re;
        }
        return re;
    }
}
