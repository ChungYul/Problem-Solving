package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("2016년 문제 테스트")
class TwoThousandSixteenTest {

  @Test
  @DisplayName("기본 테스트")
  void testSolution() {
    TwoThousandSixteen twoThousandSixteen = new TwoThousandSixteen();
    assertEquals("TUE", twoThousandSixteen.solution(5, 24));
  }

}
