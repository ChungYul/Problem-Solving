package com.choong.problem.programmers.level2;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 
 * @title   : 기능개발
 * @author  : CHOONG
 * @Desc    : 프로그래머스, 기능개발
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/42586
 *
 */

public class FunDev {

  public int[] solution(int[] progresses, int[] speeds) {
    final int NIL = -1;
    int[] answer = {};
    int count = 0;

    List<Integer> answerList = new ArrayList<Integer>();

    while (!IntStream.of(progresses).allMatch(i -> i == -1)) {

      for (int j = 0; j < progresses.length; j++) {
        if (progresses[j] != NIL) {
          progresses[j] = progresses[j] + speeds[j];
        }
      }

      for (int j = 0; j < progresses.length; j++) {

        if (progresses[j] != NIL && progresses[j] < 100) {
          break;
        } else if (progresses[j] != NIL && progresses[j] >= 100) {
          count++;
          progresses[j] = NIL;
        }

      }

      if (count != 0) {
        answerList.add(count);
      }

      count = 0;
    }

    answer = answerList.stream().mapToInt(i -> i.intValue()).toArray();

    // System.out.println(Arrays.toString(answer));

    return answer;
  }

}
