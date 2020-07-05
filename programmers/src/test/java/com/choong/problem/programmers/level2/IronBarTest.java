package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("쇠막대기 테스트")
class IronBarTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution() {
    IronBar ironBar = new IronBar();
    assertEquals(17, ironBar.solution("()(((()())(())()))(())"));
  }

}
