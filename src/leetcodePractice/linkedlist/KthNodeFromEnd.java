package leetcodePractice.linkedlist;

public class KthNodeFromEnd {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("kth node from the end: " +  myLinkedList.findKthFromEnd(3).value);
    }
}
