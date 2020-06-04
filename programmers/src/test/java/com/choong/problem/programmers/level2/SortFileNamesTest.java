package com.choong.problem.programmers.level2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("파일명 정렬")
class SortFileNamesTest {

  @DisplayName("기본 테스트 케이스")
  @Test
  void testSolution() {
    SortFileNames sortFileNames = new SortFileNames();
    assertArrayEquals(
        new String[] {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II",
            "F-14 Tomcat"},
        sortFileNames.solution(new String[] {"F-5 Freedom Fighter", "B-50 Superfortress",
            "A-10 Thunderbolt II", "F-14 Tomcat"}));
    assertArrayEquals(
        new String[] {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"},
        sortFileNames.solution(new String[] {"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"}));
  }

}
