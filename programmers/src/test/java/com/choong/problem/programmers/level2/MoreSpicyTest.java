package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("더 맵게 테스트")
class MoreSpicyTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution_with_basic_test_case() {
    MoreSpicy moreSpicy = new MoreSpicy();
    assertEquals(2, moreSpicy.solution(new int[] {1, 2, 3, 9, 10, 12}, 7));
  }

  @Test
  @DisplayName("모든 데이터가 K보다 큰 데이터 테스트")
  void testSolution_with_all_element_greater_than_K() {
    MoreSpicy moreSpicy = new MoreSpicy();
    assertEquals(0, moreSpicy.solution(new int[] {8, 9, 10, 11}, 7));
  }

  @Test
  @DisplayName("모든 데이터가 K보다 큰 데이터 테스트")
  void testSolution_with_can_not_make_K() {
    MoreSpicy moreSpicy = new MoreSpicy();
    assertEquals(-1, moreSpicy.solution(new int[] {1, 1, 0}, 7));
  }

}
