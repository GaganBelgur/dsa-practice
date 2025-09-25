package main.java.com.gaganbelgur.dsa.linkedlist;

public class InsertOperationsImpl implements InsertOperations {

    @Override
    public ListNode insertAtHead(ListNode head, int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        return node;
    }

    @Override
    public ListNode insertAtTail(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if(head == null) {
            return newNode;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
}
