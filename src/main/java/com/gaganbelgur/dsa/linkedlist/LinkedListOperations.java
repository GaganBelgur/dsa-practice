package main.java.com.gaganbelgur.dsa.linkedlist;

public class LinkedListOperations {

    public ListNode insertAtHead(ListNode head, int X) {
        ListNode node = new ListNode(X);
        node.next = head;
        return node;
    }

}
