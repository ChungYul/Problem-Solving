package com.choong.problem.knowledge.algorithm.dynamic;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Dynamic Programming-Lession 1")
class FibonacciTest {
  
  @DisplayName("Memoization 방법과 Tabulation 방식 비")
  @Test
  void Compare_Memoization_and_Tabulation_Method() {
    
    Fibonacci fibonacci = new Fibonacci();
    
    fibonacci.initialize();
    assertEquals(fibonacci.fibonacciWithMemorization(40), fibonacci.finbonacciWithBottomUp(40));
    
  }

}
