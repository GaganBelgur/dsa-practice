package main.java.com.gaganbelgur.dsa.linkedlist;

public class LinkedListOperations implements InsertOperations {

    @Override
    public ListNode insertAtHead(ListNode head, int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        return node;
    }

    @Override
    public ListNode insertAtTail(ListNode head, int data) {
        return null;
    }
}
