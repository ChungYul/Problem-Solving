package com.choong.problem.knowledge.datastructure.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
  private final Map<Character, TrieNode> children = new HashMap<Character, TrieNode>();
  private boolean endOfWord;
  
  public boolean isEndOfWord() {
    return endOfWord;
  }

  public void setEndOfWord(boolean endOfWord) {
    this.endOfWord = endOfWord;
  }

  public Map<Character, TrieNode> getChildren() {
    return children;
  }
  
}
