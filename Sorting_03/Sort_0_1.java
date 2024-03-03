package Sorting_03;

public class Sort_0_1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0};

        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[j] == 0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                i++;
                j++;
            }
            if (j < arr.length && arr[j] == 1) {
                j++;
            }
        }

        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }

    }
}
