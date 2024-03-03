package Sorting_03;

public class Sort_0_1_2 {

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 1, 2, 2, 0, 1, 2, 2, 1, 0, 1, 2, 0, 2, 1, 0, 0};

        int i = 0;
        int j = 0;
        int k = arr.length - 1;

        while (j < arr.length && j < k) {
            if (j < arr.length && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;
            } else if (j < arr.length && arr[j] == 1) {
                j++;
            } else if (j < arr.length && arr[j] == 2) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;

                k--;
            }
        }

        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }

    }

}
