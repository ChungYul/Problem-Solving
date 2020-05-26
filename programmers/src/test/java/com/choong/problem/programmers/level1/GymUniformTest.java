package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GymUniformTest {

  @Test
  void testSolution() {
    GymUniform gymUniform = new GymUniform();
    assertEquals(5, gymUniform.solution(5, new int[] {2, 4}, new int[] {1, 3, 5}));
    assertEquals(4, gymUniform.solution(5, new int[] {2, 4}, new int[] {3}));
    assertEquals(4, gymUniform.solution(5, new int[] {1, 2}, new int[] {2, 3}));
    assertEquals(2, gymUniform.solution(3, new int[] {1, 2}, new int[] {2, 3}));
    assertEquals(3, gymUniform.solution(3, new int[] {1, 2, 3}, new int[] {1, 2, 3}));
    assertEquals(2, gymUniform.solution(3, new int[] {3}, new int[] {1}));
    assertEquals(6, gymUniform.solution(7, new int[] {2, 3, 4}, new int[] {1, 2, 3, 6}));
    assertEquals(4, gymUniform.solution(5, new int[] {2, 3, 4}, new int[] {3, 4, 5}));
  }

}
