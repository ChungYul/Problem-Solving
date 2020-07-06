package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("기능개발 테스트")
class FunDevTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution() {
    FunDev funDev = new FunDev();
    assertArrayEquals(new int[] {2, 1},
        funDev.solution(new int[] {93, 30, 55}, new int[] {1, 30, 5}));
  }

}
