package Sorting_03;

public class Merge_Sort_04 {
    public static void main(String[] args) {

        int[] arr = {7, 4, 1, 3, 6, 8, 2, 5};

        System.out.print("Old:-");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int[] ans = mergeSort(arr, 0, arr.length - 1);

        System.out.print("New:- ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] mergeSort(int[] arr, int lo, int hi) {
        if (lo == hi) {
            int[] ba = new int[1];
            ba[0] = arr[lo];
            return ba;
        }

        int mid = (lo + hi) / 2;
        int[] fsh = mergeSort(arr, lo, mid);
        int[] ssh = mergeSort(arr, mid + 1, hi);
        int[] fsa = mergeTwoSortedArray(fsh, ssh);
        return fsa;
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2) {
        int[] mergeArr = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergeArr[k] = arr1[i];
                i++;
            } else {
                mergeArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            mergeArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            mergeArr[k] = arr2[j];
            j++;
            k++;
        }
        return mergeArr;
    }

}
