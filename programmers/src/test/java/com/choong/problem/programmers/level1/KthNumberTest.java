package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("K번째 수 테스트")
class KthNumberTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution() {
    
    KthNumber kthNumber = new KthNumber();
    assertArrayEquals(new int[] {5,6,3 }, kthNumber.solution(new int[] {1, 5, 2, 6, 3, 7, 4},
        new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}}) );
    
  }

}
