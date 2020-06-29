package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("가운데 글자 가져오기 테스트")
class GetMiddleLetterTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution() {
    GetMiddleLetter getMiddleLetter = new GetMiddleLetter();
    assertEquals("c", getMiddleLetter.solution("abcde"));
    assertEquals("we", getMiddleLetter.solution("qwer"));
  }

}
