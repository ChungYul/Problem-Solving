package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FailureRateTest {

  @Test
  void testSolution() {

    FailureRate failureRate = new FailureRate();
    
    assertArrayEquals(new int[] {7, 6, 5, 4, 3, 2, 1, 8},
        failureRate.solution(8, new int[] {1, 2, 3, 4, 5, 6, 7}));

    assertArrayEquals(new int[] {3, 4, 2, 1, 5},
        failureRate.solution(5, new int[] {2, 1, 2, 6, 2, 4, 3, 3}));

    assertArrayEquals(new int[] {4, 1, 2, 3}, 
        failureRate.solution(4, new int[] {4, 4, 4, 4, 4}));
  }

}
