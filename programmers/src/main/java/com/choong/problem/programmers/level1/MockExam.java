package com.choong.problem.programmers.level1;

import java.util.stream.IntStream;

/**
 * 
 * @title	: 모이고사
 * @author	: CHOONG
 * @Desc	: 프로그래머스 모이고사 문제 
 *
 */

public class MockExam {

  public int[] solution(int[] answers) {
    final int[] firstAnswer = {1, 2, 3, 4, 5};
    final int[] secondAnswer = {2, 1, 2, 3, 2, 4, 2, 5};
    final int[] thirdAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    int[] answer = {};
    int[] scores = {0, 0, 0, 0};

    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == firstAnswer[i % 5]) {
        scores[1]++;
      }
      if (answers[i] == secondAnswer[i % 8]) {
        scores[2]++;
      }
      if (answers[i] == thirdAnswer[i % 10]) {
        scores[3]++;
      }
    }

    int max = IntStream.of(scores).max().getAsInt();

    answer = IntStream.range(1, scores.length).filter(i -> (max == scores[i])).toArray();

    return answer;
  }
}
