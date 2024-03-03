package Sorting_03;

import java.util.Arrays;

public class Target_Sum_Pair_06 {
    public static void main(String[] args) {
        int[] arr = {7, 15, 3, 18, 6, 4, 19, 2, 12, 11, 9};
        int target = 18;

        int i = 0;
        int j = arr.length - 1;
        Arrays.sort(arr);
        System.out.print("New Array :- ");
        for (int a = 0; a < arr.length; a++) {
            System.out.print(arr[a] + " ");
        }
        System.out.println();
        System.out.println("Answers  :-");
        while (i < j) {
            if (arr[i] + arr[j] > target) {
                j--;
            } else if (arr[i] + arr[j] < target) {
                i++;
            } else if (arr[i] + arr[j] == target) {
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            }
        }

    }
}
