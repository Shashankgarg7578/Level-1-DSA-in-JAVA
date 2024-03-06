package Linked_List_06;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_to_Queue_Adapter_03 {

    LinkedList<Integer> list;

    public LinkedList_to_Queue_Adapter_03(){
        list = new LinkedList<>();
    }

    void add(int val){
        list.addLast(val);
    }

    int remove(){
        return list.removeFirst();
    }

    int size(){
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
        LinkedList_to_Queue_Adapter_03 linkedList = new LinkedList_to_Queue_Adapter_03();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.display();
        System.out.println();
        System.out.println("Size:- " + linkedList.size());
        System.out.println("Peek:- " + linkedList.peek());
        System.out.println("Pop:- " + linkedList.remove());
        System.out.println("Peek :- " + linkedList.peek());
        linkedList.display();
    }

}
