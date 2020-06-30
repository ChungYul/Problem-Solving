package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("두 정수 사이의 합 테스트")
class SumBetweenTwoIntegersTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution() {
    
    SumBetweenTwoIntegers sumBetweenTwoIntegers = new SumBetweenTwoIntegers();
    assertEquals(12, sumBetweenTwoIntegers.solution(3, 5));
    assertEquals(3, sumBetweenTwoIntegers.solution(3, 3));
    assertEquals(12, sumBetweenTwoIntegers.solution(5, 3));
    
  }

}
