package main.java.com.gaganbelgur.dsa.linkedlist;

public class SearchOperationsImpl implements SearchOperation {

    @Override
    public boolean searchKey(ListNode head, int key) {
        while(head != null) {
            if(head.val == key) {
                return true;
            }
            head = head.next;
        }

        return false;
    }

    @Override
    public boolean searchKeyIterative(ListNode head, int key) {
        for (ListNode temp = head; temp != null; temp = temp.next) {
            if (temp.val == key) return true;
        }
        return false;
    }

    @Override
    public boolean searchKeyRecursive(ListNode head, int key) {
        if (head == null) return false;
        if (head.val == key) return true;
        return searchKeyRecursive(head.next, key);
    }
}
