package main.java.com.gaganbelgur.dsa.linkedlist.singlelinkedlist;

public class DeleteOperationsImpl implements DeleteOperations {

    @Override
    public ListNode deleteHead(ListNode head) {
        if(head == null) return null;
        return head.next;
    }
}
