package Queue_05;

public class Normal_Queue_01 {

    int[] data;
    int front;
    int size;

    public Normal_Queue_01(int cap) {
        data = new int[cap];
        front = 0;
        size = 0;
    }

    void add(int val) {
        if (size == data.length) {
            System.out.println("Data is Overflow !!");
        } else {
            int rear = (front + size) % data.length;
            data[rear] = val;
            size++;
        }
    }

    int peek() {
        if (size == 0) {
            return -1;
        } else {
            return data[front];
        }
    }

    int remove() {
        if (size == 0) {
            return -1;
        } else {
            data[front] = 0;
            int val = data[front];
            front = (front + 1) % data.length;
            size--;
            return val;
        }
    }

    int size() {
        return size;
    }

    void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void main(String[] args) {
        Normal_Queue_01 queue = new Normal_Queue_01(5);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        queue.display();

        System.out.println();
        System.out.println(queue.peek());

        queue.remove();

        queue.display();

        System.out.println();
        System.out.println(queue.peek());
    }
}
