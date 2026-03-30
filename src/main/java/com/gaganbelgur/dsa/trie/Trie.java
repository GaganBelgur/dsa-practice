package main.java.com.gaganbelgur.dsa.trie;

public class Trie implements TrieOperationsSolverInterface {

    TrieNode rootNode;

    public Trie() {
        rootNode = new TrieNode();
    }

    @Override
    public void insert(String word) {
        TrieNode node = rootNode;

        for(char ch: word.toCharArray()) {
            if(!node.containsKey(ch)) {
                node.put(ch, new TrieNode());
            }

            node = node.get(ch);
        }
        node.markEndOfWord();
    }

    @Override
    public boolean search(String word) {
        TrieNode node = rootNode;

        for(char ch: word.toCharArray()) {
            if(!node.containsKey(ch)) {
                return false;
            }

            node = node.get(ch);
        }

        return node.getIsWordEnd();
    }

    @Override
    public boolean startsWith(String prefix) {
        TrieNode node = rootNode;

        for(char ch: prefix.toCharArray()) {
            if(!node.containsKey(ch)) {
                return false;
            }

            node = node.get(ch);
        }

        return true;
    }

    public static void main(String[] args) {
        TrieOperationsSolverInterface trie = new Trie();
        trie.insert("ga");
        boolean searchResult = trie.startsWith("app");

        System.out.println(searchResult + "");

    }
}


