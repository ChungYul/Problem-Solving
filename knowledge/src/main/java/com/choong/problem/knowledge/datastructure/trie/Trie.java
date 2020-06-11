package com.choong.problem.knowledge.datastructure.trie;

public class Trie {

  private TrieNode root;

  public Trie() {
    root = new TrieNode();
  }

//  1. Set a current node as a root node
//  2. set the current letter as the first letter of the word
//  3. If the current node has already an existing reference to the current letter ( through one of
//      the elements in the "children" field), then set current node to the refrenced node.
//      Otherwise, create a new node, set the letter equal to the current letter, and also initialize
//      current node to this new node
//  4. Repeat step 3 until the key is traversed
  public void insert(String word) {
    TrieNode current = root;

    for (char c : word.toCharArray()) {
      current = current.getChildren().computeIfAbsent(c, k -> new TrieNode());
    }
    current.setEndOfWord(true);
  }

//  1. Get children of the root
//  2. Iterate through each character of the String
//  3. Check whether that character is already a part of a sub-trie. If it istn't present anywhere in
//      the trie, then stop the search, return false
//  4. Repeat the second and the third step until there isn't any charactor left in the String. If
//      the end of the String is reached. return true;
  public boolean containsNode(String word) {
    TrieNode current = root;

    for (char c : word.toCharArray()) {
      TrieNode node = current.getChildren().get(c);

      if (node == null) {
        return false;
      }

      current = node;
    }

    return current.isEndOfWord();
  }

  public void delete(String word) {
    delete(root, word, 0);
  }
  
//  1. Check whether this element is already part of the trie
//  2. If the element is found. then remove it from the trie
  private boolean delete(TrieNode current, String word, int index) {
    // TODO Auto-generated method stub
    if (word.length() == index) {
      if (!current.isEndOfWord()) {
        return false;
      }
      current.setEndOfWord(false);
      return current.getChildren().isEmpty();
    }

    char c = word.charAt(index);
    TrieNode node = current.getChildren().get(c);

    if (node == null) {
      return false;
    }
    boolean shouldDeleteCurrentNode = delete(node, word, index + 1) && !node.isEndOfWord();

    if (shouldDeleteCurrentNode) {
      current.getChildren().remove(c);
      return current.getChildren().isEmpty();
    }
    return false;
  }

  public boolean isEmpty() {
    return root == null;
  }

}
