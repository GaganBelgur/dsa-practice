package main.java.com.gaganbelgur.dsa.linkedlist.singlelinkedlist;

public interface Operations {

    default int getLength(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }

        return count;
    }
}
