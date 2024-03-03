package Sorting_03;

public class Quick_Sort_05 {
    public static void main(String[] args) {
        int[] arr = {8, 5, 1, 3, 7, 2, 9, 6, 4,2};

        quickSort(arr, 0, arr.length - 1);

        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }

    }

    public static void quickSort(int[] arr, int lo, int hi) {
        if (lo > hi) {
            return;
        }
        int pivot = arr[hi];
        int pi = partitionOfArray(arr, pivot, lo, hi);
        quickSort(arr, lo, pi - 1);
        quickSort(arr, pi + 1, hi);
    }

    public static int partitionOfArray(int[] arr, final int pivot, final int lo, final int hi) {
        int i = lo;
        int j = lo;
        while (j <= hi) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j++;
            } else if (arr[j] > pivot) {
                j++;
            }
        }
        return (i - 1);
    }

}
