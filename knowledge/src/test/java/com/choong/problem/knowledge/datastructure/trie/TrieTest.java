package com.choong.problem.knowledge.datastructure.trie;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TrieTest {

  @Test
  public void givenATrie_WhenAddingElements_ThenTrieNotEmpty() {
    Trie trie = createExampleTrie();
    
    assertFalse(trie.isEmpty());
  }
  
  @Test
  public void givenATrie_WhenAddingElements_ThenTrieContainsThoseElements() {
    Trie trie = createExampleTrie();
    
    assertFalse(trie.containsNode("3"));
    assertFalse(trie.containsNode("vida"));
    assertTrue(trie.containsNode("life"));
  }
  
  private Trie createExampleTrie() {
    Trie trie = new Trie();
    
    trie.insert("Programming");
    trie.insert("is");
    trie.insert("a");
    trie.insert("way");
    trie.insert("of");
    trie.insert("life");
    
    return trie;
  }

}
