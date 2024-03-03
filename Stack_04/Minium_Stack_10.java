package Stack_04;

import java.util.Stack;

public class Minium_Stack_10 {
    Stack<Integer> allData = new Stack<>();
    Stack<Integer> minData = new Stack<>();

    void push(int val) {
        allData.push(val);
        if (minData.size() == 0 || minData.peek() >= val) {
            minData.push(val);
        }
    }

    int pop() {
        if (allData.size() > 0) {
            int val = allData.pop();
            if (minData.peek() == val) {
                minData.pop();
            }
            return val;
        } else {
            return -1;
        }
    }

    int size() {
        return allData.size();
    }

    int min() {
        if (minData.size() > 0) {
            return minData.peek();
        } else {
            return -1;
        }
    }

    int top() {
        if (allData.size() > 0) {
            return allData.peek();
        } else {
            return -1;
        }
    }

    void display() {
        System.out.print("All Data Stack :- ");
        while (allData.size() > 0) {
            System.out.print(allData.pop() + " ");
        }
        System.out.println();
        System.out.print("All Data Stack :- ");
        while (minData.size() > 0) {
            System.out.print(minData.pop() + " ");
        }
    }

    public static void main(String[] args) {
        Minium_Stack_10 miniumStack = new Minium_Stack_10();
        miniumStack.push(10);
        miniumStack.pop();
        miniumStack.push(20);
        miniumStack.push(30);
        miniumStack.push(40);
        miniumStack.push(5);
        miniumStack.display();
    }
}
