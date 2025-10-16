package main.java.com.gaganbelgur.dsa.linkedlist.singlelinkedlist;

import java.util.Stack;

public class SingleLinkedListOperationsImpl implements SingleLinkedListOperations {

    @Override
    public SingleLinkedListNode insertAtHead(SingleLinkedListNode head, int data) {
        SingleLinkedListNode node = new SingleLinkedListNode(data);
        node.next = head;
        return node;
    }

    @Override
    public SingleLinkedListNode insertAtTail(SingleLinkedListNode head, int data) {
        SingleLinkedListNode newNode = new SingleLinkedListNode(data);
        if(head == null) {
            return newNode;
        }
        SingleLinkedListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    @Override
    public SingleLinkedListNode deleteHead(SingleLinkedListNode head) {
        if(head == null) return null;
        return head.next;
    }

    @Override
    public boolean searchKey(SingleLinkedListNode head, int key) {
        while(head != null) {
            if(head.val == key) {
                return true;
            }
            head = head.next;
        }

        return false;
    }

    @Override
    public boolean searchKeyIterative(SingleLinkedListNode head, int key) {
        for (SingleLinkedListNode temp = head; temp != null; temp = temp.next) {
            if (temp.val == key) return true;
        }
        return false;
    }

    @Override
    public boolean searchKeyRecursive(SingleLinkedListNode head, int key) {
        if (head == null) return false;
        if (head.val == key) return true;
        return searchKeyRecursive(head.next, key);
    }

    @Override
    public int getLength(SingleLinkedListNode head) {
        int count = 0;
        SingleLinkedListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    @Override
    public SingleLinkedListNode middleOfLinkedList(SingleLinkedListNode head) {
        SingleLinkedListNode fastPointer = head;
        SingleLinkedListNode slowPointer = head;

        while(fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer;
    }

    @Override
    public SingleLinkedListNode reverseLinkedListRecursively(SingleLinkedListNode head) {
        return reverseRecursively(null, head);
    }

    @Override
    public SingleLinkedListNode reverseLinkedListIteratively(SingleLinkedListNode head) {
         Stack<Integer> stack = new Stack<>();
         SingleLinkedListNode temp = head;

         while (temp != null) {
           stack.push(temp.val);
           temp = temp.next;
         }

         SingleLinkedListNode newHead = new SingleLinkedListNode(stack.pop());
         SingleLinkedListNode current = newHead;

         while (!stack.isEmpty()) {
           current.next = new SingleLinkedListNode(stack.pop());
           current = current.next;
         }

         return newHead;
    }

    @Override
    public boolean detectLoopInLL(SingleLinkedListNode head) {
        SingleLinkedListNode fastPointer = head;
        SingleLinkedListNode slowPointer = head;

        while(fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if(fastPointer == slowPointer) return true;
        }
        return false;
    }

    @Override
    public SingleLinkedListNode findStartingPoint(SingleLinkedListNode head) {
        return null;
    }

    private SingleLinkedListNode reverseRecursively(SingleLinkedListNode prev, SingleLinkedListNode current) {
        if(current == null) return prev;

        SingleLinkedListNode next = current.next;
        current.next = prev;

        return reverseRecursively(current, next);
    }
}
