package Stack_04;

import java.util.Stack;

public class Sliding_Window_Maximum_06 {
    public static void main(String[] args) {
        int[] arr = {2, 9, 3, 8, 1, 7, 12, 6, 14, 4, 32, 0, 7, 19, 8, 12, 6};

        int[] nge = new int[arr.length];
        nge[nge.length - 1] = nge.length;

        Stack<Integer> st = new Stack<>();
        st.push(arr.length - 1);

        //Next Greater Element to the Right ->
        for (int i = arr.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            if (st.size() > 0) {
                nge[i] = st.peek();
            } else {
                nge[i] = arr.length;
            }
            st.push(i);
        }


        System.out.println();
        System.out.println("Next Greater Element from right '->' Array is :-");
        for (int a = 0; a < nge.length; a++) {
            System.out.print(nge[a] + ", ");
        }

        //Sliding window Calculation
        int k = 4; // for sliding window
        int j = 0;
        int[] ans = new int[arr.length];
        for (int i = 0; i <= arr.length - k; i++) {
            if (j < i) {
                j = i;
            }

            while (nge[j] < i + k) {
                j = nge[j];
            }
            ans[i] = arr[j];
        }

        System.out.println();
        System.out.println("Sliding window Array is :-");
        for (int a = 0; a < ans.length; a++) {
            System.out.print(ans[a] + ", ");
        }

    }
}
