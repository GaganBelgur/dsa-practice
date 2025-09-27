package main.java.com.gaganbelgur.dsa.linkedlist.doublelinkedlist;

public class DoubleLinkedListOperationsImpl implements DoubleLinkedListOperations {
    @Override
    public DoubleLinkedListNode insertBeforeHead(DoubleLinkedListNode head, int data) {
        DoubleLinkedListNode temp = new DoubleLinkedListNode(data);
        temp.setNext(head);
        head.setPrev(temp);
        return temp;
    }
}
