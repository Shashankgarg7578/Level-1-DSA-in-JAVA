package Stack_04;

import java.util.Stack;

public class InfixEvaluation_07 {
    public static void main(String[] args) {
        String str = "2+(5-3*6/2)";

        Stack<Integer> operandSt = new Stack<>();
        Stack<Character> operatorSt = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                operatorSt.push(ch);
            } else if (Character.isDigit(ch)) {
                operandSt.push(ch - '0');
            } else if (ch == ')') {
                while (operatorSt.peek() != '(') {
                    Character operator = operatorSt.pop();
                    int val2 = operandSt.pop();
                    int val1 = operandSt.pop();
                    int opv = operation(val1, val2, operator);
                    operandSt.push(opv);
                }
                operatorSt.pop();
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (operatorSt.size() > 0 && operatorSt.peek() != '(' && precedence(ch) <= precedence(operatorSt.peek())) {
                    Character operator = operatorSt.pop();
                    int val2 = operandSt.pop();
                    int val1 = operandSt.pop();
                    int opv = operation(val1, val2, operator);
                    operandSt.push(opv);
                }
                operatorSt.push(ch);
            }
        }

        while (operatorSt.size() > 0) {
            Character operator = operatorSt.pop();
            int val2 = operandSt.pop();
            int val1 = operandSt.pop();
            int opv = operation(val1, val2, operator);
            operandSt.push(opv);
        }

    }

    public static int precedence(char oper) {
        if (oper == '+' || oper == '-') {
            return 1;
        } else if (oper == '*' || oper == '/') {
            return 2;
        } else {
            return 1;
        }
    }


    public static int operation(int val1, int val2, Character oper) {
        int val = 0;
        if (oper == '+') {
            val = val1 + val2;
        } else if (oper == '-') {
            val = val1 - val2;
        } else if (oper == '*') {
            val = val1 * val2;
        } else if (oper == '/') {
            val = val1 / val2;
        }
        return val;
    }

}
