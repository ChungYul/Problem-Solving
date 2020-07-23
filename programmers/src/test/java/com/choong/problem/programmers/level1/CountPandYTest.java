package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("문자열 내 p와 y의 개수")
class CountPandYTest {

  @Test
  @DisplayName("P와 Y의 개수가 같은 경우")
  void testSolution_when_number_of_p_and_y_is_same() {
    CountPandY countPandY = new CountPandY();
    assertEquals(true, countPandY.solution("pPoooyY"));
  }
  
  @Test
  @DisplayName("P와 Y의 개수가 다 경우")
  void testSolution_when_number_of_p_and_y_is_different() {
    CountPandY countPandY = new CountPandY();
    assertEquals(false, countPandY.solution("Pyy"));
  }
  
  @Test
  @DisplayName("P와 Y가 없는 경우")
  void testSolution_without_p_and_y() {
    CountPandY countPandY = new CountPandY();
    assertEquals(true, countPandY.solution("hello world"));
  }


}
