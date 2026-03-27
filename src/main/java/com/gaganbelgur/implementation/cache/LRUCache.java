package main.java.com.gaganbelgur.implementation.cache;

import java.util.HashMap;
import java.util.Map;

public class LRUCache implements LRUCacheSolverInterface {

    private Map<Integer, Node> cacheMap;
    private int capacity;

    private Node head;

    private Node tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cacheMap = new HashMap<>();

        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.prev = head;
    }

    @Override
    public int get(int key) {
        if(!cacheMap.containsKey(key)) return -1;

        Node node = cacheMap.get(key);
        int value = node.value;

        deleteNode(node);
        insertNodeAfterHead(node);
        return value;
    }

    @Override
    public void put(int key, int value) {
        if(cacheMap.containsKey(key)) {
            Node node = new Node(key, value);
            cacheMap.put(key, node);
            deleteNode(node);
            insertNodeAfterHead(node);
            return;
        }

        if(cacheMap.size() == capacity) {
            Node node = tail.prev;
            cacheMap.remove(node);
            deleteNode(node);
        }
    }

    private void deleteNode(Node node) {
        Node prevNode = node.prev;
        Node nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    private void insertNodeAfterHead(Node node) {
        Node nextNode = head.next;
        head.next = node;
        nextNode.prev = node;

        node.prev = head;
        node.next = nextNode;
    }
}
