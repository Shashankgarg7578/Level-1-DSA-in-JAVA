package Sorting_03;

public class MergeTwoSorted_Array_04 {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 12, 18, 20};
        int[] arr2 = {7, 9, 11, 15, 25, 28, 30, 35};
        int[] mergeArr = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergeArr[k] = arr1[i];
                i++;
            } else  {
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

        for (int a = 0; a < mergeArr.length; a++) {
            System.out.print(mergeArr[a] + " ");
        }

    }
}
