package Sorting_03;

public class Insertion_Sort_03 {
    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 1, 3};

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >=0; j--) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }else{
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
