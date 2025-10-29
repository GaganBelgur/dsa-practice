package main.java.com.gaganbelgur.dsa.linkedlist.doublelinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
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
        List<List<Integer>> result = new ArrayList<>();
        if(head == null) return result;

        DoubleLinkedListNode secondPointer = head;
        DoubleLinkedListNode firstPointer = head;

        while(secondPointer.next != null) {
            secondPointer = secondPointer.next;
        }

        while(firstPointer != null && secondPointer != null && firstPointer != secondPointer && secondPointer.next != firstPointer) {
            int sum = firstPointer.val + secondPointer.val;
            if(sum == target) {
                result.add(Arrays.asList(firstPointer.val, secondPointer.val));
                firstPointer = firstPointer.next;
                secondPointer = secondPointer.prev;
            } else if(sum < target) {
                firstPointer = firstPointer.next;
            } else {
                secondPointer = secondPointer.prev;
            }
        }

        return result;
    }

    @Override
    public DoubleLinkedListNode removeDuplicates(DoubleLinkedListNode head) {
        return null;
    }
}
