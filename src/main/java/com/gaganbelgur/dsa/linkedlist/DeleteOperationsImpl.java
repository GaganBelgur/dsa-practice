package main.java.com.gaganbelgur.dsa.linkedlist;

public class DeleteOperationsImpl implements DeleteOperations {

    @Override
    public ListNode deleteHead(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return null;
        return head.next;
    }
}
