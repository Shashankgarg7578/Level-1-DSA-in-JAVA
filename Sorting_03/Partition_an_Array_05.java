package Sorting_03;

public class Partition_an_Array_05 {

    public static void main(String[] args) {
        int[] arr = {7, 9, 4, 8, 3, 6, 2, 1};
        int pivot = 5;

        //partiton by pivot element
        int i = 0;
        int j = 0;
        while (j < arr.length) {
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

        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }

    }

}
