package main.java.com.gaganbelgur.dsa.linkedlist.singlelinkedlist;

public class SingleLinkedListNode {

    int val;
    SingleLinkedListNode next;

    SingleLinkedListNode() {
        val = 0;
        next = null;
    }

    SingleLinkedListNode(int data) {
        val = data;
        next = null;
    }

    SingleLinkedListNode(int data, SingleLinkedListNode next) {
        val = data;
        this.next = next;
    }
}
