package Linked_List_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Linked_List_01 {

    public static class Node {
        int data;
        Node next;

        public Node() {
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static class CustomLinkedList {
        Node head;
        Node tail;
        int size;

        public CustomLinkedList() {
        }

        public CustomLinkedList(Node head, Node tail, int size) {
            this.head = head;
            this.tail = tail;
            this.size = size;
        }

        void addFirst(int val) {
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;
            if (size == 0) {
                head = tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
            size++;
        }

        void addLast(int val) {
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = null;
            if (size == 0) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        int removeFirst() {
            if (size == 0) {
                System.out.println("List is underflow!!");
                return -1;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            } else {
                Node temp = head;
                head = head.next;
                size--;
                return temp.data;
            }
        }

        int removeLast() {
            if (size == 0) {
                System.out.println("List is underflow!!");
                return -1;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            } else {
                Node temp = head;

                for (int i = 0; i < size - 2; i++) {
                    temp = temp.next;
                }
                int val = temp.next.data;
                temp.next = null;
                tail = temp;
                size--;
                return val;
            }
        }

        int removeAtIndex(int index) {
            if (size == 0) {
                System.out.println("List is underflow!!");
                return -1;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            } else {
                Node temp = head;

                for (int i = 0; i < index - 2; i++) {
                    temp = temp.next;
                }
                Node valNode = temp.next;
                temp.next = temp.next.next;
                size--;
                valNode.next = null;
                return valNode.data;
            }
        }


        int getFirst() {
            if (size == 0) {
                return -1;
            } else {
                return head.data;
            }
        }

        int getLast() {
            if (size == 0) {
                return -1;
            } else {
                return tail.data;
            }
        }

        int getAt(int index) {
            if (size == 0) {
                return -1;
            } else if (index < 0 || index > size) {
                return -1;
            } else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                return temp.data;
            }
        }

        int size() {
            return size;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        Node getNodeAt(int index) {
            if (size == 0) {
                return null;
            } else if (index < 0 || index > size) {
                return null;
            } else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                return temp;
            }
        }

        void reverseLLByIndex() {
            int li = 1;
            int ri = size;

            while (li < ri) {
                Node lval = getNodeAt(li);
                Node rval = getNodeAt(ri);

                int temp = lval.data;
                lval.data = rval.data;
                rval.data = temp;

                li++;
                ri--;
            }
        }

        void reverseLLByPointers() {
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            Node temp = head;
            head = tail;
            tail = temp;

        }

        int kthElementFromLast(int index) {
            if (index < 0 || index > size) {
                return -1;
            }

            Node slow = head;
            Node fast = head;

            for (int i = 0; i < index - 1; i++) {
                fast = fast.next;
            }

            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow.data;
        }

        int middleOfLinkedList() {
            if (size == 0) {
                return -1;
            }

            Node slow = head;
            Node fast = head;

            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow.data;
        }

        void displayReverse(Node node) {
            if (node == null) {
                return;
            }
            displayReverse(node.next);
            System.out.print(node.data + ", ");
        }

        void removeDuplicates(LinkedList<Integer> nlist) {
            Node temp = head;
            while (temp != null) {
                if (nlist.size() == 0 || temp.data != nlist.getLast()) {
                    nlist.addLast(temp.data);
                }
                temp = temp.next;
            }
        }




    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CustomLinkedList list = new CustomLinkedList();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("addFirst")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addFirst(val);
            } else if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            } else if (str.startsWith("size")) {
                System.out.println(list.size());
            } else if (str.startsWith("removeFirst")) {
                System.out.println(list.removeFirst());
            } else if (str.startsWith("removeLast")) {
                System.out.println(list.removeLast());
            } else if (str.startsWith("removeAtIndex")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                System.out.println(list.removeAtIndex(val));
            } else if (str.startsWith("getFirst")) {
                System.out.println(list.getFirst());
            } else if (str.startsWith("getLast")) {
                System.out.println(list.getLast());
            } else if (str.startsWith("getAt")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                System.out.println(list.getAt(val));
            } else if (str.startsWith("reverseLLByIndex")) {
                list.reverseLLByIndex();
            } else if (str.startsWith("reverseLLByPointers")) {
                list.reverseLLByPointers();
            } else if (str.startsWith("kthElementFromLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                System.out.println(list.kthElementFromLast(val));
            } else if (str.startsWith("middleOfLinkedList")) {
                System.out.println(list.middleOfLinkedList());
            } else if (str.equals("displayReverse")) {
                list.displayReverse(list.head);
            } else if (str.equals("display")) {
                list.display();
            } else if (str.equals("removeDuplicates")) {
                LinkedList<Integer> removedDuplicatesList = new LinkedList<>();
                list.removeDuplicates(removedDuplicatesList);
                System.out.print(removedDuplicatesList);
            }
            str = br.readLine();
        }

    }


}
