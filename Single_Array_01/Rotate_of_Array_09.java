package Single_Array_01;

public class Rotate_of_Array_09 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int rotate = 3;

        //for handel negative index.
        if (rotate < 0) {
            rotate = rotate + arr.length;
        }
        //for handel more then length or big value.
        if (rotate > arr.length) {
            rotate = rotate % arr.length;
        }

        reverse(arr, 0, arr.length - rotate - 1);
        reverse(arr, arr.length - rotate, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void reverse(int[] arr, final int i, final int j) {
        int a = i;
        int b = j;
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            a++;
            b--;
        }
    }


}
