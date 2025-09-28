package main.java.com.gaganbelgur.dsa.linkedlist.doublelinkedlist;

public class DoubleLinkedListOperationsImpl implements DoubleLinkedListOperations {

    @Override
    public DoubleLinkedListNode insertBeforeHead(DoubleLinkedListNode head, int data) {
        DoubleLinkedListNode temp = new DoubleLinkedListNode(data);
        temp.setNext(head);
        head.setPrev(temp);
        return temp;
    }

    @Override
    public DoubleLinkedListNode deleteHead(DoubleLinkedListNode head) {
        if(head == null ||head.getNext() == null) return null;

        DoubleLinkedListNode temp = head;
        head = head.getNext();
        head.setNext(null);
        temp.setNext(null);
        return head;
    }
}
