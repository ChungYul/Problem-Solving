package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("가장 큰 수 테스트")
class LargestNumberTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution() {
    LargestNumber largestNumber = new LargestNumber();
    
    assertEquals("6210", largestNumber.solution(new int[] {6, 10, 2}));
    assertEquals("9534330", largestNumber.solution(new int[] {3, 30, 34, 5, 9}));
  }

}
