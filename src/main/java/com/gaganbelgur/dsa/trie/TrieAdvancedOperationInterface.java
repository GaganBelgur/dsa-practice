package main.java.com.gaganbelgur.dsa.trie;

public interface TrieAdvancedOperationInterface {

    void insert(String word);

    int countWordsEqualTo(String word);

    int countWordsStartingWith(String prefix);

    void erase(String word);
}
