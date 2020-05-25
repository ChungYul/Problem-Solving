package com.choong.problem.programmers.level1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * 
 * @title   : 모이고사 테스트 케이스
 * @author  : CHOONG
 * @Desc    : 프로그래머스 모이고사 문제 테스트 케이스 
 *
 */

class MockExamTest {

  @ParameterizedTest
  @MethodSource("streamOfDataSetProvider")
  void testSolution(int[][] argument) {
    MockExam mockExam = new MockExam();
    assertArrayEquals(argument[1], mockExam.solution(argument[0]));
  }
  
  static Stream<Arguments> streamOfDataSetProvider() {
    return Stream.of(Arguments.of((Object) new int[][] { {1,2,3,4,5}, {1} }),
        Arguments.of((Object) new int[][] {{1,3,2,4,2},{1,2,3}}));
  }

}
