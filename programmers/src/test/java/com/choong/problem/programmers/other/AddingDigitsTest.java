package com.choong.problem.programmers.other;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("자릿수 더하기 테스트")
class AddingDigitsTest {
  
  @DisplayName("기본 테스트 케이스")
  @Test
  void testSolution() {
    AddingDigits addingDigits = new AddingDigits();
    assertEquals(6, addingDigits.solution(123));
    assertEquals(24, addingDigits.solution(987));
  }

}
