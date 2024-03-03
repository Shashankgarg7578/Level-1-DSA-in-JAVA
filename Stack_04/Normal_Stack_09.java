package Stack_04;

public class Normal_Stack_09 {
    int[] data;
    int tos;

    public Normal_Stack_09(int cap) {
        data = new int[cap];
        tos = -1;
    }

    void push(int val) {
        if (tos == data.length - 1) {
            System.out.println("Data is overflow!");
        } else {
            tos++;
            data[tos] = val;
        }
    }

    int pop() {
        if (tos == -1) {
            System.out.println("Data is underflow!!");
            return -1;
        } else {
            tos--;
            return data[tos];
        }
    }

    int size() {
        return tos + 1;
    }

    int top() {
        if (tos == -1) {
            System.out.println("Data is underflow!!");
            return -1;
        } else {
            return data[tos];
        }
    }

    void dynamicPush(int val) {
        if (tos == data.length) {
            int ndata[] = new int[2 * data.length];

            for (int i = 0; i < data.length; i++) {
                ndata[i] = data[i];
            }
            data = ndata;
            tos++;
            data[tos] = val;
        } else {
            tos++;
            data[tos] = val;
        }
    }

    void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void main(String[] args) {
        Normal_Stack_09 normalStack = new Normal_Stack_09(5);
        normalStack.push(12);
        normalStack.push(13);
        System.out.println("Top:-" + normalStack.top());
        normalStack.pop();
        normalStack.push(11);
        normalStack.pop();
        normalStack.push(10);
        normalStack.push(9);
        System.out.println("Top:-" + normalStack.top());
        System.out.println();
        normalStack.display();
    }
}
