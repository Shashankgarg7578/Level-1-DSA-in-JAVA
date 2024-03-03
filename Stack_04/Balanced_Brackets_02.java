package Stack_04;

import java.util.Stack;

public class Balanced_Brackets_02 {
    public static void main(String[] args) {
        String str = "[(a+b)+{(c+d)*(e/f)}]";
//        String str = "[(a+b)+{(c+d)*(e/f)]}";
//        String str = "[(a+b)+{(c+d)*(e/f)}";

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                while (st.size() > 0 && st.peek() != '(') {
                    if (st.peek() == '{' || st.peek() == '[') {
                        System.out.println(false);
                        return;
                    }
                    st.pop();
                }
                st.pop();
            } else if (ch == '}') {
                while (st.size() > 0 && st.peek() != '{') {
                    if (st.peek() == '(' || st.peek() == '[') {
                        System.out.println(false);
                        return;
                    }
                    st.pop();
                }
                st.pop();
            } else if (ch == ']') {
                while (st.size() > 0 && st.peek() != '[') {
                    if (st.peek() == '(' || st.peek() == '{') {
                        System.out.println(false);
                        return;
                    }
                    st.pop();
                }
                st.pop();
            } else {
                st.push(ch);
            }
        }

        if (st.size() > 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }


    }
}
