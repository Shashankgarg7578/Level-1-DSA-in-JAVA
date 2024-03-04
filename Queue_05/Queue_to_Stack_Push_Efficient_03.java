package Queue_05;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_to_Stack_Push_Efficient_03 {

    Queue<Integer> mainQ = new ArrayDeque<>();
    Queue<Integer> helperQ = new ArrayDeque<>();

    void push(int val) {
        mainQ.add(val);
    }

    int pop() {
        if (mainQ.size() == 0) {
            return -1;
        } else {
            while (mainQ.size() > 1) {
                helperQ.add(mainQ.remove());
            }
            int val = mainQ.remove();
            while (helperQ.size() > 0) {
                mainQ.add(helperQ.remove());
            }
            return val;
        }
    }

    int size() {
        return mainQ.size();
    }

    int top() {
        if (mainQ.size() == 0) {
            return -1;
        } else {
            while (mainQ.size() > 1) {
                helperQ.add(mainQ.remove());
            }
            int val = mainQ.peek();

            helperQ.add(mainQ.remove());
            while (helperQ.size() > 0) {
                mainQ.add(helperQ.remove());
            }
            return val;
        }
    }

    public static void main(String[] args) {
        Queue_to_Stack_Push_Efficient_03 queueToStack = new Queue_to_Stack_Push_Efficient_03();
        queueToStack.push(10);
        queueToStack.push(20);
        queueToStack.push(30);
        queueToStack.push(40);
        System.out.println(queueToStack.top());
       System.out.println(queueToStack.size());
        System.out.println(queueToStack.pop());
        System.out.println(queueToStack.size());
        System.out.println(queueToStack.top());

    }
}
