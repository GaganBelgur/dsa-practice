package main.java.com.gaganbelgur.implementation.cache;

public class Node {

    public int key, value;
    public Node prev, next;

    Node() {
        key = value = -1;
        prev = next = null;
    }

    Node(int key, int value) {
        this.key = key;
        this.value = value;
        next = prev = null;
    }
}
