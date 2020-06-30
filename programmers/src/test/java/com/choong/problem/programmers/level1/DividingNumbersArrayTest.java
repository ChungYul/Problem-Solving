package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("나누어 떨어지는 숫자 배열 테스")
class DividingNumbersArrayTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution() {
    DividingNumbersArray dividingNumbersArray = new DividingNumbersArray();
    assertArrayEquals(new int[] {5, 10}, dividingNumbersArray.solution(new int[] {5, 9, 7, 10}, 5));
    assertArrayEquals(new int[] {1, 2, 3, 36},
        dividingNumbersArray.solution(new int[] {2, 36, 1, 3}, 1));
    assertArrayEquals(new int[] {-1}, dividingNumbersArray.solution(new int[] {3, 2, 6}, 10));

  }

}
