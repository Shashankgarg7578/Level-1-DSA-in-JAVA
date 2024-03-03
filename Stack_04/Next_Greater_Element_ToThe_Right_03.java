package Stack_04;

import java.util.Stack;

public class Next_Greater_Element_ToThe_Right_03 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};

        int[] ngeR = new int[arr.length];
        ngeR[ngeR.length - 1] = -1;

        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.size() > 0) {
                ngeR[i] = st.peek();
            } else {
                ngeR[i] = -1;
            }
            st.push(arr[i]);
        }

        for (int a = 0; a < ngeR.length; a++) {
            System.out.print(ngeR[a] + ", ");
        }

    }
}
