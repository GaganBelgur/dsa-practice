package main.java.com.gaganbelgur.dsa.linkedlist.singlelinkedlist;

public class ListNode {

    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data) {
        val = data;
        next = null;
    }

    ListNode(int data, ListNode next) {
        val = data;
        this.next = next;
    }
}
