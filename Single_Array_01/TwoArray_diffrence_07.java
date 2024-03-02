package Single_Array_01;

public class TwoArray_diffrence_07 {
    public static void main(String[] args) {
        //case : 1
        int[] one = {3, 3, 3, 3, 3, 3};
        int[] two = {9, 9, 9, 9, 9};

        //case : 2
//        int[] one = {1,0,0,0};
//        int[] two = {1};

        int[] diff = new int[one.length]; // which is on first array or top one

        int i = one.length - 1;
        int j = two.length - 1;
        int k = diff.length - 1;

        int c = 0;
        while (k >= 0) {
            int v = 0;
            if (j >= 0) {
                v = two[j];
            }

            if (one[i] + c >= v) {
                diff[k] = ((one[i] + c) - v);
                c = 0;
            } else {
                diff[k] = ((one[i] + c + 10) - v);
                c = -1;
            }
            i--;
            j--;
            k--;
        }

        if (c > 0) {
            System.out.println(c + " ");
        }

        for (int a = 0; a < diff.length; a++) {
            System.out.print(diff[a] + " ");
        }


    }
}
