package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("x만큼 간격이 있는 n개의 숫자 테스트")
class IntervalByXTest {

  @DisplayName("기본 테스트 케이스")
  @Test
  void testSolution() {
    IntervalByX intervalByX = new IntervalByX();
    assertArrayEquals(new long[] {2,4,6,8,10}, intervalByX.solution(2, 5));
    assertArrayEquals(new long[] {4,8,12}, intervalByX.solution(4, 3));
    assertArrayEquals(new long[] {-4,-8}, intervalByX.solution(-4, 2));
  }

}
