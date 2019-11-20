import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * 栈：后进先出
 * 列队：先进先出
 */
public class StackPushPop {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {
        StackPushPop haha = new StackPushPop();
        haha.push(1);
        haha.push(2);
        haha.push(3);
        System.out.println(haha.pop());
        System.out.println(haha.pop());
        haha.push(4);
        System.out.println(haha.pop());
        haha.push(5);
        System.out.println(haha.pop());
        System.out.println(haha.pop());
    }

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        int result;
        while (!stack1.isEmpty()) {
            int tmp = stack1.pop();
            stack2.push(tmp);
        }
        result = stack2.pop();
        while (!stack2.isEmpty()) {
            int tmp = stack2.pop();
            stack1.push(tmp);
        }
        return result;
    }
}
