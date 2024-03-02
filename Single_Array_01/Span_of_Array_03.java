package Single_Array_01;

public class Span_of_Array_03 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 5, 45, 2};
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }

        System.out.println("Span of array is :- " + (maxVal-minVal));


    }

}
