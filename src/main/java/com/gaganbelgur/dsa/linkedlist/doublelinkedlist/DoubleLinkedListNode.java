package main.java.com.gaganbelgur.dsa.linkedlist.doublelinkedlist;

public class DoubleLinkedListNode {

    int val;
    DoubleLinkedListNode next;
    DoubleLinkedListNode prev;

    public DoubleLinkedListNode(int val) {
        this.val = val;
    }

    public DoubleLinkedListNode(int val, DoubleLinkedListNode next, DoubleLinkedListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}
