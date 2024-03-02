package Single_Array_01;

public class FindElement_In_Array_04 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 5, 1, 67, 12};
        int num = 67;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("number found");
        } else {
            System.out.println("number not found");
        }

    }

}
