package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("크레인 인형뽑기 게임 테스트")
class CraneGameTest {

  @DisplayName("기본 테스트 케이스")
  @Test
  void testSolution() {
    CraneGame craneGame = new CraneGame();
    assertEquals(4, craneGame.solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1},
      {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}}, new int[] {1, 5, 3, 5, 1, 2, 1, 4}));
  }

}
