package Single_Array_01;

public class Reverse_of_Array_08 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Old array :- ");
        for(int a = 0 ;a< arr.length; a++){
            System.out.print(arr[a]+" ");
        }
        int i = 0;
        int j = arr.length - 1;

        //reverse
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.print("New array :- ");
        for(int a = 0 ;a< arr.length; a++){
            System.out.print(arr[a]+" ");
        }

    }
}
