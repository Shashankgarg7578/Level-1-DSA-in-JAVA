package Single_Array_01;

public class Ceil_And_Floor_12 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90,100};

        int val = 65;
        int floor = Integer.MAX_VALUE;
        int ceil = Integer.MIN_VALUE;
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (val < arr[mid]) {
                hi = mid - 1;
                ceil = arr[mid];
            } else if (val > arr[mid]) {
                lo = mid + 1;
                floor = arr[mid];
            } else {
                break;
            }
        }

        System.out.println("floor :- " + floor + ", " + "ceil:- " + ceil + " ");

    }
}
