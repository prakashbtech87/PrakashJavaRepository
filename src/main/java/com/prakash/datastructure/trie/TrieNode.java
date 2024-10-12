package com.prakash.datastructure.trie;

/**
 * @author prakashkaruppusamy
 */
class TrieNode {
    // Each node can have multiple children (one for each character)
    TrieNode[] children = new TrieNode[26]; // For 'a' to 'z'
    boolean isEndOfWord = false; // Indicates if a word ends at this node

    // Constructor
    public TrieNode() {
        for (int i = 0; i < 26; i++) {
            children[i] = null; // Initialize children to null
        }
    }
}

class Trie {
    private TrieNode root; // Root node of the Trie

    // Constructor
    public Trie() {
        root = new TrieNode(); // Initialize the root node
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a'; // Get the index for the character (0 for 'a', 1 for 'b', ...)
            if (node.children[index] == null) {
                node.children[index] = new TrieNode(); // Create a new node if it doesn't exist
            }
            node = node.children[index]; // Move to the child node
        }
        node.isEndOfWord = true; // Mark the end of the word
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            int index = c - 'a'; // Get the index for the character
            if (node.children[index] == null) {
                return false; // If the node doesn't exist, the word isn't in the Trie
            }
            node = node.children[index]; // Move to the child node
        }
        return node.isEndOfWord; // Return true if it's the end of a word
    }

    // Check if there is any word in the Trie that starts with the given prefix
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a'; // Get the index for the character
            if (node.children[index] == null) {
                return false; // If the node doesn't exist, no words with this prefix
            }
            node = node.children[index]; // Move to the child node
        }
        return true; // Found the prefix
    }
}
