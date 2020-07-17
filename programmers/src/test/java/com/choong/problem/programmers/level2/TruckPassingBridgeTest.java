package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("다리를 지나는 트럭")
class TruckPassingBridgeTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution() {
    TruckPassingBridge truckPassingBridge = new TruckPassingBridge();
    assertEquals(8, truckPassingBridge.solution(2, 10, new int[] {7, 4, 5, 6}));
    assertEquals(101, truckPassingBridge.solution(100, 100, new int[] {10}));
    assertEquals(110, truckPassingBridge.solution(100, 100, new int[] {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
  }

}
