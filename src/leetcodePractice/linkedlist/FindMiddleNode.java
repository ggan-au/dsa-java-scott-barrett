package leetcodePractice.linkedlist;

public class FindMiddleNode {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);

        System.out.println("Middle node is: " +  myLinkedList.findMiddleNode().value);
    }
}
