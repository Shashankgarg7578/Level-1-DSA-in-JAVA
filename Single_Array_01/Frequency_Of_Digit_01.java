package Single_Array_01;

public class Frequency_Of_Digit_01 {

    public static void main(String[] args) {
        int num = 23452224;
        int findNum = 7;
        int freqCount = 0;
        while (num > 0) {
            int dig = num % 10;
            if (dig == findNum) {
                freqCount++;
            }
            num = num / 10;
        }
        System.out.println(freqCount);
    }

}
