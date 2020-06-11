package com.choong.problem.knowledge.datastructure.trie;

public class Trie {

  private TrieNode root;

  public Trie() {
    root = new TrieNode();}

  public void insert(String word) {
    TrieNode current = root;
    
    for(char c : word.toCharArray()) {
      current = current.getChildren().computeIfAbsent(c, k -> new TrieNode());
    }
    current.setEndOfWord(true);
  }
  
  public boolean containsNode(String word) {
    TrieNode current = root;
    
    for(char c : word.toCharArray()) {
      TrieNode node = current.getChildren().get(c);
      
      if(node == null) {
        return false;
      }
      
      current = node;
    }
    
    return current.isEndOfWord();
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public boolean isEmpty() {
   return root == null;
  }

}
