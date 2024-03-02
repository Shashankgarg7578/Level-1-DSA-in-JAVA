package Single_Array_01;

public class TwoArray_Sum_06 {
    public static void main(String[] args) {
        int[] one = {9, 3, 4, 6, 8};
        int[] two = {1, 9, 8, 8};
        int[] sum = new int[one.length > two.length ? one.length : two.length];

        int i = one.length - 1;
        int j = two.length - 1;
        int k = sum.length - 1;

        int c = 0;
        while (k >= 0) {
            int dig = c;

            if (i >= 0) {
                dig += one[i];
            }
            if (j >= 0) {
                dig += two[j];
            }

            sum[k] = dig % 10;
            c = dig / 10;

            i--;
            j--;
            k--;
        }

        if (c != 0) {
            System.out.print(c + " ");
        }

        for (int a = 0; a < sum.length; a++) {
            System.out.print(sum[a] + " ");
        }

    }

}
