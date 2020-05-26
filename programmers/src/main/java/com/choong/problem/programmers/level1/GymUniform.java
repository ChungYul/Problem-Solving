package com.choong.problem.programmers.level1;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @title   : 체육복
 * @author  : CHOONG
 * @Desc    : 프로그래머스 체육복 문제
 *
 */
public class GymUniform {

  public int solution(int n, int[] lost, int[] reserve) {
    int answer = n - lost.length;

    // 체육복이 있는 학생 : false
    // 체육복이 없는 학생 : true
    boolean[] total = new boolean[n];
    IntStream.of(lost).forEach(i -> total[i - 1] = true);
    Set<Integer> reserveSet = IntStream.of(reserve).boxed().collect(Collectors.toSet());

    for (int val : lost) {
      if (reserveSet.remove(val)) {
        total[val - 1] = false;
        answer++;
      }
    }

    reserve = reserveSet.stream().mapToInt(i -> i.intValue()).toArray();

    for (int val : reserve) {
      if (val != 1 && total[val - 2]) {
        total[val - 2] = false;
        answer++;
      } else if (val != n && total[val]) {
        total[val] = false;
        answer++;
      }
    }

    return answer;
  }

}
