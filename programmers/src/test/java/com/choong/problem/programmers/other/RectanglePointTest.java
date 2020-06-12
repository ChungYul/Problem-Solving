package com.choong.problem.programmers.other;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("나머지 한 점 테스트")
class RectanglePointTest {

  @Test
  @DisplayName("기본 테스")
  void testSolution() {
    RectanglePoint rectanglePoint = new RectanglePoint();
    assertArrayEquals(new int[] {1, 10}, rectanglePoint.solution(new int[][] {{1, 4}, {3, 4}, {3, 10}}));
    assertArrayEquals(new int[] {2, 1}, rectanglePoint.solution(new int[][] {{1, 1}, {2, 2}, {1, 2}}));
  }

}
