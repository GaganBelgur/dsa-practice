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
        if (head == null) {
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
        if (head == null) return null;
        return head.next;
    }

    @Override
    public boolean searchKey(SingleLinkedListNode head, int key) {
        while (head != null) {
            if (head.val == key) {
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
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    @Override
    public SingleLinkedListNode middleOfLinkedList(SingleLinkedListNode head) {
        SingleLinkedListNode fastPointer = head;
        SingleLinkedListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
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

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (fastPointer == slowPointer) return true;
        }
        return false;
    }

    @Override
    public SingleLinkedListNode findStartingPoint(SingleLinkedListNode head) {
        SingleLinkedListNode fastPointer = head;
        SingleLinkedListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (fastPointer == slowPointer) {
                slowPointer = head;

                while (slowPointer != fastPointer) {
                    slowPointer = slowPointer.next;
                    fastPointer = fastPointer.next;
                }
                return slowPointer;
            }
        }
        return null;
    }

    @Override
    public SingleLinkedListNode removeNthFromEnd(SingleLinkedListNode head, int n) {
        if (head == null) return head;

        SingleLinkedListNode dummy = new SingleLinkedListNode(0);
        dummy.next = head;

        SingleLinkedListNode endPointer = dummy;
        SingleLinkedListNode startPointer = dummy;

        for (int i = 0; i <= n; i++) {
            if (endPointer == null) return head;
            endPointer = endPointer.next;
        }

        while (endPointer != null) {
            startPointer = startPointer.next;
            endPointer = endPointer.next;
        }

        startPointer.next = startPointer.next.next;

        return dummy.next;
    }

    @Override
    public SingleLinkedListNode deleteMiddleNode(SingleLinkedListNode head) {
        return deleteMiddleNodeBruteForce(head);
    }

    @Override
    public SingleLinkedListNode addTwoNumbers(SingleLinkedListNode l1, SingleLinkedListNode l2) {
        SingleLinkedListNode dummy = new SingleLinkedListNode(0);
        SingleLinkedListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new SingleLinkedListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }

    private SingleLinkedListNode reverseRecursively(SingleLinkedListNode prev, SingleLinkedListNode current) {
        if (current == null) return prev;

        SingleLinkedListNode next = current.next;
        current.next = prev;

        return reverseRecursively(current, next);
    }

    private SingleLinkedListNode deleteMiddleNodeBruteForce(SingleLinkedListNode head) {
        if (head == null || head.next == null) return null;

        SingleLinkedListNode temp = head;
        int nodeCount = 0;

        while (temp != null) {
            temp = temp.next;
            nodeCount++;
        }

        nodeCount /= 2;
        temp = head;

        for (int i = 1; i < nodeCount; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    private SingleLinkedListNode deleteMiddleNodeOptimized(SingleLinkedListNode head) {
        if (head == null || head.next == null) return null;

        SingleLinkedListNode fastPointer = head;
        SingleLinkedListNode slowPointer = head;
        SingleLinkedListNode prev = null;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            prev = slowPointer;
            slowPointer = slowPointer.next;
        }

        prev.next = slowPointer.next;

        return head;
    }
}
