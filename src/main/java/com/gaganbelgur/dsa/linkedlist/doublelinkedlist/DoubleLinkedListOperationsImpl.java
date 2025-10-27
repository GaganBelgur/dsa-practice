package main.java.com.gaganbelgur.dsa.linkedlist.doublelinkedlist;

import java.util.List;

public class DoubleLinkedListOperationsImpl implements DoubleLinkedListOperations {

    @Override
    public DoubleLinkedListNode insertBeforeHead(DoubleLinkedListNode head, int data) {
        DoubleLinkedListNode temp = new DoubleLinkedListNode(data);
        temp.next = head;
        head.prev = temp;
        return temp;
    }

    @Override
    public DoubleLinkedListNode deleteHead(DoubleLinkedListNode head) {
        if(head == null ||head.next == null) return null;

        DoubleLinkedListNode temp = head;
        head = head.next;
        head.next = null;
        temp.next = null;
        return head;
    }

    @Override
    public DoubleLinkedListNode deleteAllOccurrences(DoubleLinkedListNode head, int target) {
        if (head == null) return head;

        DoubleLinkedListNode temp = head;

        while (temp != null) {
            DoubleLinkedListNode nextNode = temp.next;

            if (temp.val == target) {
                if(temp == head) {
                    head = nextNode;
                }
                DoubleLinkedListNode prev = temp.prev;
                DoubleLinkedListNode next = temp.next;
                if (prev != null) prev.next = next;
                if (next != null) next.prev = prev;
            }
            temp = temp.next;
        }

        return head;
    }

    @Override
    public List<List<Integer>> findPairsWithGivenSum(DoubleLinkedListNode head, int target) {
        return List.of();
    }
}
