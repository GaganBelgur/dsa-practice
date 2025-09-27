package main.java.com.gaganbelgur.dsa.linkedlist.singlelinkedlist;

public interface SearchOperation extends Operations {

    boolean searchKey(ListNode head, int key);

    boolean searchKeyIterative(ListNode head, int key);

    boolean searchKeyRecursive(ListNode head, int key);

}
