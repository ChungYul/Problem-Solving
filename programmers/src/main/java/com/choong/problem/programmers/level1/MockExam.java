package com.choong.problem.programmers.level1;

public class MockExam {

  public static int[] solution(int[] answers) {
    final int[] firstAnswer = {1, 2, 3, 4, 5};
    final int[] secondAnswer = {2, 1, 2, 3, 2, 4, 2, 5};
    final int[] thirdAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    int[] answer = {};
    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == firstAnswer[i % 5]) {

      }

      if (answers[i] == secondAnswer[i % 8]) {

      }

      if (answers[i] == thirdAnswer[i % 10]) {

      }

    }
    return answer;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

}
