package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("피보나치 수 테스트")
class FibonacciTest {

  @Test
  @DisplayName("Int 자료형 최대값 보다 작은 피보나치 수")
  void testSolution_with_less_than_the_maximum_value_of_int() {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(1, fibonacci.solution(1));
    assertEquals(1, fibonacci.solution(2));
    assertEquals(2, fibonacci.solution(3));
    assertEquals(5, fibonacci.solution(5));
  }

  @DisplayName("Int 자료형 최대값 보다 큰 피보나치 수")
  void testSolution_with_number_greater_than_maximum_value_of_int() {
    Fibonacci fibonacci = new Fibonacci();
    assertEquals(174677, fibonacci.solution(44));
  }
}
