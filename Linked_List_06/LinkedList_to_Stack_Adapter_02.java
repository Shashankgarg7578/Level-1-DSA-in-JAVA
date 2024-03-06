package Linked_List_06;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_to_Stack_Adapter_02 {

    LinkedList<Integer> list;

    public LinkedList_to_Stack_Adapter_02() {
        list = new LinkedList<>();
    }

    void push(int val) {
        list.addFirst(val);
    }

    int pop() {
        return list.removeFirst();
    }

    int size() {
        return list.size();
    }

    int peek() {
        return list.getFirst();
    }

    void display() {
        ListIterator iter = list.listIterator();
        System.out.println();
        while (iter.hasNext()) {
            System.out.print(iter.next() + ", ");
        }
    }

    public static void main(String[] args) {
        LinkedList_to_Stack_Adapter_02 linkedList = new LinkedList_to_Stack_Adapter_02();
        linkedList.push(10);
        linkedList.push(20);
        linkedList.push(30);
        linkedList.push(40);
        linkedList.display();
        System.out.println();
        System.out.println("Size:- " + linkedList.size());
        System.out.println("Peek:- " + linkedList.peek());
        System.out.println("Pop:- " + linkedList.pop());
        System.out.println("Peek :- " + linkedList.peek());
        linkedList.display();
    }

}
