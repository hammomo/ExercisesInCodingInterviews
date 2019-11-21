/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
import java.util.Stack;

public class MinInStack {
    Stack<Integer> data = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();

    public static void main(String[] args) {
        MinInStack test = new MinInStack();
        int[] arr = {5,2,1,4,3};
        for (int i: arr) {
            test.push(i);
        }
        System.out.println(test.min());
    }

    public void push(int node) {
        data.push(node);
        if (min.isEmpty()) {
            min.push(node);
        } else {
            int num = min.pop();
            min.push(num);
            if (node < num) {
                min.push(node);
            }
        }
    }

    public void pop() {
        int num1 = data.pop();
        int num2 = min.pop();
        if (num1 != num2) {
            min.push((num2));
        }
    }

    public int top() {
        int num = data.pop();
        data.push(num);
        return num;
    }

    public int min() {
        int num = min.pop();
        min.push(num);
        return num;
    }
}
