package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("주식가격")
class StackPriceTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution() {
    StackPrice stackprice = new StackPrice();
    assertArrayEquals(new int[] {4, 3, 1, 1, 0}, stackprice.solution(new int[] {1, 2, 3, 2, 3}));
    assertArrayEquals(new int[] {4, 3, 2, 1, 0}, stackprice.solution(new int[] {1, 1, 1, 1, 1}));
    assertArrayEquals(new int[] {1, 1, 1, 0}, stackprice.solution(new int[] {4, 3, 2, 1}));
  }

}
