package Single_Array_01;

public class LastIndex_in_Array_13 {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 20, 20, 30, 30, 30, 30, 80};
        int val = 30; // find last index

        int lo = 0;
        int hi = arr.length;
        int li = Integer.MIN_VALUE;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (val > arr[mid]) {
                lo = mid + 1;
            } else if (val < arr[mid]) {
                hi = mid - 1;
            } else {
                li = mid;
                lo = mid + 1;
            }
        }

        System.out.println(li);

    }
}
