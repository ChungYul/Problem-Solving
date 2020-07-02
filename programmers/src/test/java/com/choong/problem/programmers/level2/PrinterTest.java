package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("프린터 테스트")
class PrinterTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution_with_basic_input() {

    Printer printer = new Printer();

    assertEquals(1, printer.solution(new int[] {2, 1, 3, 2}, 2));
    assertEquals(5, printer.solution(new int[] {1, 1, 9, 1, 1, 1}, 0));
  }

  @Test
  @DisplayName("Edge 테스트 케이스")
  void testSolution_with_edge_inpu() {
    Printer printer = new Printer();
    
    assertEquals(3, printer.solution(new int[] {1, 2, 3}, 0));
  }

}
