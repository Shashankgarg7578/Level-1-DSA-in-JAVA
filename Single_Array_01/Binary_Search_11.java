package Single_Array_01;

public class Binary_Search_11 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int find = 2;
        int lo = 0;
        int hi = arr.length - 1;
        int mid = Integer.MIN_VALUE;
        boolean found = false;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (arr[mid] > find) {
                hi = mid - 1;
            } else if (arr[mid] < find) {
                lo = mid + 1;
            }else{
                found = true;
                break;
            }

        }

        if(found){
            System.out.print("Value found on index :- "+mid);
        }else{
            System.out.print("Value not found in given array!!");
        }

    }
}
