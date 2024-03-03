package Stack_04;

import java.util.Stack;

public class Stock_Span_04 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 6, 7, 1, 2, 3, 11, 10, 3, 4, 5, 10, 8};

        int[] spanArr = new int[arr.length];
        spanArr[0] = 1;

        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if (st.size() > 0) {
                spanArr[i] = i - st.peek();
            } else {
                spanArr[i] = i + 1;
            }
            st.push(i);
        }

        for (int a = 0; a < spanArr.length; a++) {
            System.out.print(spanArr[a] + ", ");
        }

    }
}
