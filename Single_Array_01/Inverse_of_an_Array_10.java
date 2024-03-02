package Single_Array_01;

public class Inverse_of_an_Array_10 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 2, 0, 5, 7, 6};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]] = arr[i];
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

    }
}
