package main.java.com.gaganbelgur.dsa.linkedlist.doublelinkedlist;

public class DoubleLinkedListNode {

    private int val;
    private DoubleLinkedListNode next;
    private DoubleLinkedListNode prev;

    public DoubleLinkedListNode(int val) {
        this.val = val;
    }

    public DoubleLinkedListNode(int val, DoubleLinkedListNode next, DoubleLinkedListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public DoubleLinkedListNode getNext() {
        return next;
    }

    public void setNext(DoubleLinkedListNode next) {
        this.next = next;
    }

    public DoubleLinkedListNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleLinkedListNode prev) {
        this.prev = prev;
    }
}
