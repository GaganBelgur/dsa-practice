package main.java.com.gaganbelgur.dsa.trie;

public interface TrieOperationsSolverInterface {
    void insert(String word);

    boolean search(String word);

    boolean startsWith(String prefix);
}
