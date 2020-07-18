package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("h-index 테스트")
class H_IndexTest {

  @Test
  @DisplayName("중간 값이 h-index 일때")
  void testSolution_when_median_is_H_Index() {
    H_Index h_Index = new H_Index();
    assertEquals(3, h_Index.solution(new int[] {3, 0, 6, 1, 5}));
    h_Index.solution(new int[] {3, 2, 0, 0, 0, 0, 0});
    h_Index.solution(new int[] {7, 8, 9, 10, 11});
    h_Index.solution(new int[] {10, 9, 4, 1, 1});

  }

  @Test
  @DisplayName("인용 횟수가 총 논문 개수 보다 많을 때")
  void testSolution_when_number_of_citations_is_more_than_total_number_of_article() {
    H_Index h_Index = new H_Index();
    assertEquals(5, h_Index.solution(new int[] {7, 8, 9, 10, 11}));
  }

  @Test
  @DisplayName("그 외의 경우")
  void testSolution_other_cases() {
    H_Index h_Index = new H_Index();
    assertEquals(2, h_Index.solution(new int[] {3, 2, 0, 0, 0, 0, 0}));
    assertEquals(3, h_Index.solution(new int[] {10, 9, 4, 1, 1}));
  }

}
