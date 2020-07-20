package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("큰 수 만들기 테스트")
class MakeLargestNumberTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution() {
    MakeLargestNumber makeLargestNumber = new MakeLargestNumber();
    
    assertEquals("94", makeLargestNumber.solution("1924", 2));
    assertEquals("3234", makeLargestNumber.solution("1231234", 3));
    assertEquals("775841", makeLargestNumber.solution("4177252841", 4));
    assertEquals("333", makeLargestNumber.solution("333331", 3));
  }
  
}
