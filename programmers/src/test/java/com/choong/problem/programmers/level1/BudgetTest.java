package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("예산 문제 테스트")
class BudgetTest {

  @DisplayName("기본 테스트 케이스")
  @Test
  void testSolution() {
    Budget budget = new Budget();
    assertEquals(3, budget.solution(new int[] {1, 3, 2, 5, 4}, 9));
    assertEquals(4, budget.solution(new int[] {2, 2, 3, 3}, 10));
  }

}
