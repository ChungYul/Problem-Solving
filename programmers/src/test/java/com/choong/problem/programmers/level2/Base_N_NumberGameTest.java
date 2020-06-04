package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Base_N_NumberGameTest {

  @Test
  void testSolution() {
    Base_N_NumberGame base_N_NumberGame = new Base_N_NumberGame();
    assertEquals("0111", base_N_NumberGame.solution(2, 4, 2, 1));
    assertEquals("02468ACE11111111", base_N_NumberGame.solution(16, 16, 2, 1));
    assertEquals("13579BDF01234567", base_N_NumberGame.solution(16, 16, 2, 2));
  }

}
