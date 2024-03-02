package Single_Array_01;

public class Memory_Of_Array_02 {

    public static void main(String[] args) {
        int[] one = new int[3];
        one[0] = 100;
        one[1] = 200;
        one[2] = 300;
        System.out.print("one prev array:- ");
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i] + " ");
        }

        int[] two = one;
        two[2] = 400;

        System.out.println();

        System.out.print("one new array:- ");
        for (int i = 0; i < one.length; i++) {
            System.out.print(one[i] + " ");
        }
    }

}
