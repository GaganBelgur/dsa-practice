package main.java.com.gaganbelgur.dsa.linkedlist.doublelinkedlist;

import java.util.List;

public interface DoubleLinkedListOperations {

    DoubleLinkedListNode insertBeforeHead(DoubleLinkedListNode head, int data);

    DoubleLinkedListNode deleteHead(DoubleLinkedListNode head);

    DoubleLinkedListNode deleteAllOccurrences(DoubleLinkedListNode head, int target);

    List<List<Integer>> findPairsWithGivenSum(DoubleLinkedListNode head, int target);

    DoubleLinkedListNode removeDuplicates(DoubleLinkedListNode head);
}
