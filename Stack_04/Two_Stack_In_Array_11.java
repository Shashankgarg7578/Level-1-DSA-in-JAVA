package Stack_04;

public class Two_Stack_In_Array_11 {
    int[] data;
    int tos1;
    int tos2;

    public Two_Stack_In_Array_11() {
    }

    public Two_Stack_In_Array_11(int cap) {
        data = new int[cap];
        tos1 = -1;
        tos2 = data.length;
    }

    void push1(int val) {
        if (tos2 == tos1 + 1) {
            System.out.println("Data Overloading !!");
        } else {
            tos1++;
            data[tos1] = val;
        }
    }

    void push2(int val) {
        if (tos2 == tos1 + 1) {
            System.out.println("Data Overloading !!");
        } else {
            tos2--;
            data[tos2] = val;
        }
    }

    int size1() {
        return tos1 + 1;
    }

    int size2() {
        return data.length - tos2;
    }

    int pop1() {
        if (tos1 == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            data[tos1] = 0;
            tos1--;
            return data[tos1];
        }
    }

    int pop2() {
        if (tos2 == data.length) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            data[tos2] = 0;
            tos2++;
            return data[tos2];
        }
    }

    int top1() {
        if (size1() == 0) {
            return -1;
        } else {
            return data[tos1];
        }
    }

    int top2() {
        if (size2() == data.length) {
            return -1;
        } else {
            return data[tos2];
        }
    }

    void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }

    public static void main(String[] args) {

        Two_Stack_In_Array_11 twoStack = new Two_Stack_In_Array_11(5);
        twoStack.push1(10);
        twoStack.push2(50);
        twoStack.push1(20);
        twoStack.push2(40);
        twoStack.push2(30);
        twoStack.pop2();
        twoStack.pop1();
        twoStack.display();
        System.out.println();
        System.out.println(twoStack.size1());
        System.out.println(twoStack.size2());

    }
}
