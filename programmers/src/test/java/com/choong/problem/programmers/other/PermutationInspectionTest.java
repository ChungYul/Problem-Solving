package com.choong.problem.programmers.other;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("순열 검사 테스트")
class PermutationInspectionTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution() {
    PermutationInspection permutationInspection = new PermutationInspection();
    
    assertTrue(permutationInspection.solution(new int[] {4, 1, 3, 2}));
    assertFalse(permutationInspection.solution(new int[] {4, 1, 3}));
  }
  
  @Test
  @DisplayName("배열 값에 0이 있을 때")
  void when_element_include_zero() {
    PermutationInspection permutationInspection = new PermutationInspection();
    
    assertFalse(permutationInspection.solution(new int[] {4, 1, 0}));
  }

}
