package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("후보키 테스트")
class CandidateKeyTest {
  
  @DisplayName("기본 테스트 케이스")
  @Test
  void testSolution_with_Basic_Input() {
    CandidateKey candidateKey = new CandidateKey();
    
    assertEquals(2, candidateKey.solution(new String[][] {{"100", "ryan", "music", "2"}, {"200", "apeach", "math", "2"},
                                                          {"300", "tube", "computer", "3"}, {"400", "con", "computer", "4"},
                                                          {"500", "muzi", "music", "3"}, {"600", "apeach", "music", "2"}}));
  }
  
  @DisplayName("Edge 테스트 케이스")
  @Test
  void testSolution_with_Edge_Input() {
    CandidateKey candidateKey = new CandidateKey();    
    
    assertEquals(5, candidateKey.solution(new String[][]  {{"b", "2", "a", "a", "b"}, {"b", "2", "7", "1", "b"},
      {"1", "0", "a", "a", "8"}, {"7", "5", "a", "a", "9"}, {"3", "0", "a", "f", "9"}}));
  }

}
