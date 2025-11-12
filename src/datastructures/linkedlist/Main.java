package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        myLinkedList.printList();
        System.out.println("===============");
        System.out.println("Removed: " + myLinkedList.remove(4).value);
        System.out.println("===============");
        myLinkedList.printList();

    }

}