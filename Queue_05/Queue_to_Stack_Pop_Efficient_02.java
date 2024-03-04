package Queue_05;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_to_Stack_Pop_Efficient_02 {
    private Queue<Integer> mainQ = new ArrayDeque<>();
    private Queue<Integer> helperQ = new ArrayDeque<>();

    void push(int val) {
        while (mainQ.size() > 0) {
            helperQ.add(mainQ.remove());
        }
        mainQ.add(val);
        while (helperQ.size() > 0) {
            mainQ.add(helperQ.remove());
        }
    }

    int top() {
        if (mainQ.size() == 0) {
            return -1;
        } else {
            return mainQ.peek();
        }
    }

    int pop() {
        if (mainQ.size() == 0) {
            return -1;
        } else {
            return mainQ.remove();
        }
    }

    int size() {
        return mainQ.size();
    }

    public static void main(String[] args) {
        Queue_to_Stack_Pop_Efficient_02 queueToStack = new Queue_to_Stack_Pop_Efficient_02();
        queueToStack.push(10);
        queueToStack.push(20);
        queueToStack.push(30);
        queueToStack.push(40);
        System.out.println(queueToStack.top());
        queueToStack.pop();
        System.out.println(queueToStack.top());
        System.out.println(queueToStack.size());

    }
}
