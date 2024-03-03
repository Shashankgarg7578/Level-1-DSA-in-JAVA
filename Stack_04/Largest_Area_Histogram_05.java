package Stack_04;

import java.util.Stack;

public class Largest_Area_Histogram_05 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 5, 4, 5, 1, 6};

        System.out.println("Old Array:-");
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + ", ");
        }

        //Next Smaller Element from left <-
        int[] nsel = new int[arr.length];
        nsel[0] = -1;

        Stack<Integer> st1 = new Stack<>();
        st1.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            while (st1.size() > 0 && arr[st1.peek()] > arr[i]) {
                st1.pop();
            }
            if (st1.size() > 0) {
                nsel[i] = st1.peek();
            } else {
                nsel[i] = -1;
            }
            st1.push(i);
        }

        System.out.println();
        System.out.println("Next Smaller Element from left '<-' Array is :-");
        for (int a = 0; a < nsel.length; a++) {
            System.out.print(nsel[a] + ", ");
        }

        //Next Smaller Element from Right ->
        int[] nser = new int[arr.length];
        nser[nser.length - 1] = nser.length;

        Stack<Integer> st2 = new Stack<>();
        st2.push(arr[arr.length - 1]);

        for (int i = arr.length - 2; i >= 0; i--) {
            while (st2.size() > 0 && arr[st2.peek()] > arr[i]) {
                st2.pop();
            }
            if (st2.size() > 0) {
                nser[i] = st2.peek();
            } else {
                nser[i] = arr.length;
            }
            st2.push(i);
        }

        System.out.println();
        System.out.println("Next Smaller Element from right '->' Array is :-");
        for (int a = 0; a < nser.length; a++) {
            System.out.print(nser[a] + ", ");
        }

        System.out.println();
        System.out.println();
        System.out.println("Calculation formula = (RI - LI- 1) * arr[index] ");
        //Largest Area Histogram
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int tempVal = (nser[i] - nsel[i] - 1) * arr[i];
            System.out.println("(" + nser[i] + " - (" + nsel[i] + ")- 1) * " + arr[i] + " = " + tempVal);
            if (maxArea < tempVal) {
                maxArea = tempVal;
            }
        }
        System.out.println();
        System.out.println("Max Area :- " + maxArea);
    }
}
