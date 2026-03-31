package main.java.com.gaganbelgur.dsa.trie;

public class TrieNode {

    private final TrieNode[] trieNodes = new TrieNode[256];

    private boolean isWordEnd = false;

    private int countEndWith = 0;

    private int prefixCount = 0;

    boolean containsKey(char ch) {
        return trieNodes[ch - 'a'] != null;
    }

    void put(char ch, TrieNode node) {
        trieNodes[ch - 'a'] = node;
    }

    TrieNode get(char ch) {
        return trieNodes[ch - 'a'];
    }

    void markEndOfWord() {
        isWordEnd = true;
    }

    boolean getIsWordEnd() {
        return isWordEnd;
    }

    public void increaseEnd() {
        countEndWith++;
    }

    public void increasePrefixCount() {
        prefixCount++;
    }

    public int getCountEndWith() {
        return countEndWith;
    }

    public int getPrefixCount() {
        return prefixCount;
    }

    public void decreasePrefixCount() {
        prefixCount--;
    }

    public void decreaseEndCount() {
        countEndWith--;
    }
}
