package main.java.com.gaganbelgur.dsa.trie;

public class TrieAdvancedOperationsSolverImpl implements TrieAdvancedOperationInterface {

    TrieNode rootNode;

    public TrieAdvancedOperationsSolverImpl() {
        rootNode = new TrieNode();
    }
    @Override
    public void insert(String word) {
        TrieNode node = rootNode;

        for (int i = 0; i < word.length(); i++) {
            if (!node.containsKey(word.charAt(i))) {
                node.put(word.charAt(i), new TrieNode());
            }

            node = node.get(word.charAt(i));
            node.increasePrefixCount();
        }
        node.increaseEnd();
    }

    public int countWordsEqualTo(String word) {
        TrieNode node = rootNode;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!node.containsKey(ch)) {
                return 0;
            }

            node = node.get(ch);
        }

        return node.getCountEndWith();
    }

    public int countWordsStartingWith(String word) {
        TrieNode node = rootNode;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!node.containsKey(ch)) {
                return 0;
            }

            node = node.get(ch);
        }

        return node.getPrefixCount();
    }

    public void erase(String word) {
        if (countWordsEqualTo(word) == 0) return;

        TrieNode node = rootNode;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            node = node.get(ch);
            node.decreasePrefixCount();
        }

        node.decreaseEndCount();
    }

    public static void main(String[] args) {
        TrieAdvancedOperationInterface trie = new TrieAdvancedOperationsSolverImpl();
        trie.insert("apple");
        trie.insert("apple");
        System.out.println("Inserting strings 'apple' twice into Trie");
        System.out.println("Count Words Equal to 'apple': " + trie.countWordsEqualTo("apple"));
        System.out.println("Count Words Starting With 'app': " + trie.countWordsStartingWith("app"));
        System.out.println("Erasing word 'apple' from Trie");
        trie.erase("apple");
        System.out.println("Count Words Equal to 'apple': " + trie.countWordsEqualTo("apple"));
        System.out.println("Count Words Starting With 'app': " + trie.countWordsStartingWith("app"));
        System.out.println("Erasing word 'apple' from Trie");
        trie.erase("apple");
        System.out.println("Count Words Starting With 'app': " + trie.countWordsStartingWith("app"));

    }
}
