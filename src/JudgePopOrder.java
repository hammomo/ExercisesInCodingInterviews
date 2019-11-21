/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 */
import java.util.ArrayList;
import java.util.Stack;

public class JudgePopOrder {
    Stack<Integer> stack = new Stack<Integer>();

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
//        int i = 0;
        JudgePopOrder test = new JudgePopOrder();
//        while (i < arr1.length) {
//            if (Math.random() < 0.5) {
//                test.stack.push(arr1[i]);
//                i++;
//            }
//            if (Math.random() >= 0.5 && !test.stack.isEmpty()) {
//                test.pop();
//            }
//        }
//        while (!test.stack.isEmpty()) {
//            int num = test.stack.pop();
//            System.out.print(num + " ");
//        }
        int[] arr2 = {4,5,3,2,1};
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        list.add(1); list.add(2); list.add(3);
//        System.out.print(list.remove(list.size() - 1));
//        list.forEach(value -> System.out.print(value + " "));
        System.out.print(test.IsPopOrder(arr1, arr2));
    }

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length != popA.length) {
            return false;
        }
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for (int j: pushA) {
            tmp.add(j);
        }
        boolean result = true;
        for(int i = 0; i < popA.length; i++) {
            int popNum = popA[i];
            int idx = tmp.indexOf(popNum);
            if (idx < 0) {
                result = false;
                break;
            }
            tmp.remove(idx);
            if (i < popA.length - 1) {
                if (tmp.indexOf(popA[i+1]) < idx - 1) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public void pop() {
        if (stack == null) return;
        int num = stack.pop();
        System.out.print(num + " ");
    }
}
