package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("핸드폰 번호 가리기 테스트")
class CellPhoneNumberMaskingTest {

  @DisplayName("기본 테스트 케이스")
  @Test
  void testSolution() {
   CellPhoneNumberMasking cellPhoneNumberMasking = new CellPhoneNumberMasking();
   assertEquals("*******4444", cellPhoneNumberMasking.solution("01033334444"));
   assertEquals("*****8888", cellPhoneNumberMasking.solution("027778888"));
  }

}
