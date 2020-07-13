package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("12 나라의 숫")
class NumberOf124CountryTest {

  @Test
  @DisplayName("3으로 나누어 떨어지지 않는 수 테스트")
  void testSolution_with_not_multiples_of_3() {
    NumberOf124Country country = new NumberOf124Country();
    assertEquals("1", country.solution(1));
    assertEquals("2", country.solution(2));
    assertEquals("11", country.solution(4));
    assertEquals("12", country.solution(5));
    assertEquals("21", country.solution(7));
    assertEquals("22", country.solution(8));
    assertEquals("41", country.solution(10));
    assertEquals("42", country.solution(11));
    assertEquals("111", country.solution(13));
  }
  
  @Test
  @DisplayName("3으로 나누어 떨어지는 수 테스트")
  void testSolution_with_multiples_of_3() {
    NumberOf124Country country = new NumberOf124Country();
    assertEquals("4", country.solution(3));
    assertEquals("14", country.solution(6));
    assertEquals("24", country.solution(9));
    assertEquals("44", country.solution(12));
    assertEquals("444", country.solution(39));
  }
}
