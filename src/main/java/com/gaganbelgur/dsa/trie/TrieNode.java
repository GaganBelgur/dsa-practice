package main.java.com.gaganbelgur.dsa.trie;

public class TrieNode {

    private final TrieNode[] trieNodes = new TrieNode[256];

    private boolean isWordEnd = false;

    void put(char ch, TrieNode node) {
        trieNodes[ch - 'a'] = node;
    }

    TrieNode get(char ch) {
        return trieNodes[ch - 'a'];
    }

    boolean containsKey(char ch) {
        return trieNodes[ch - 'a'] != null;
    }

    void markEndOfWord() {
        isWordEnd = true;
    }

    boolean getIsWordEnd() {
        return isWordEnd;
    }
}
