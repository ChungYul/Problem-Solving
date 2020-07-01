package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("문자열 내 맘대로 정렬하기 테스트")
class SortStringMyWayTest {

  @Test
  @DisplayName("기본 테스트 케이스")
  void testSolution() {
    SortStringMyWay sortStringMyWay = new SortStringMyWay();

    assertArrayEquals(new String[] {"car", "bed", "sun"},
        sortStringMyWay.solution(new String[] {"sun", "bed", "car"}, 1));
    assertArrayEquals(new String[] {"abcd", "abce", "cdx"},
        sortStringMyWay.solution(new String[] {"abce", "abcd", "cdx"}, 2));
  }

}
