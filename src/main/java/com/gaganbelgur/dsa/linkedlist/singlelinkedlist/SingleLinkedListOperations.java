package main.java.com.gaganbelgur.dsa.linkedlist.singlelinkedlist;

public interface SingleLinkedListOperations {

    SingleLinkedListNode insertAtHead(SingleLinkedListNode head, int data);

    SingleLinkedListNode insertAtTail(SingleLinkedListNode head, int data);

    SingleLinkedListNode deleteHead(SingleLinkedListNode head);

    boolean searchKey(SingleLinkedListNode head, int key);

    boolean searchKeyIterative(SingleLinkedListNode head, int key);

    boolean searchKeyRecursive(SingleLinkedListNode head, int key);

    int getLength(SingleLinkedListNode head);

    SingleLinkedListNode middleOfLinkedList(SingleLinkedListNode head);

    SingleLinkedListNode reverseLinkedListRecursively(SingleLinkedListNode head);

    SingleLinkedListNode reverseLinkedListIteratively(SingleLinkedListNode head);

    boolean detectLoopInLL(SingleLinkedListNode head);

    SingleLinkedListNode findStartingPoint(SingleLinkedListNode head);

    SingleLinkedListNode removeNthFromEnd(SingleLinkedListNode head, int n);

    SingleLinkedListNode deleteMiddleNode(SingleLinkedListNode head);
}
