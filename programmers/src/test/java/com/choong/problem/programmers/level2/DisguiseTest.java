package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("위장 테스트")
class DisguiseTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution_with_basic_testcase() {
    Disguise disguise = new Disguise();

    assertEquals(5, disguise.solution(new String[][] {{"yellow_hat", "headgear"},
        {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
    assertEquals(3, disguise.solution(new String[][] {{"crow_mask", "face"},
        {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}));
  }

  @Test
  @DisplayName("Edge 테스트 케이스")
  void testSolution_with_edge_testcase() {
    Disguise disguise = new Disguise();

    assertEquals(35, disguise.solution(new String[][] {{"1", "face"}, {"2", "face"}, {"3", "face"},
        {"4", "hair"}, {"5", "hair"}, {"6", "arm"}, {"7", "arm"}}));
  }

}
