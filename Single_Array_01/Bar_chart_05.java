package Single_Array_01;

public class Bar_chart_05 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 0, 7, 5};

        //find max value for make bar chart
        int maxVal = findMaxValue(arr);

        //make bar chart and print
        for (int floor = maxVal; floor >= 1; floor--) {
            for (int rooms = 0; rooms < arr.length; rooms++) {
                if (floor <= arr[rooms]) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("_" + " ");
                }
            }
            System.out.println();
        }

    }

    public static int findMaxValue(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

}
