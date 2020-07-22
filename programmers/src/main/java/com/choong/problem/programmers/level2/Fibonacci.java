package com.choong.problem.programmers.level2;

import java.util.stream.IntStream;

/**
 * 
 * @title	: 피보나치 수
 * @author	: CHOONG
 * @url		: https://programmers.co.kr/learn/courses/30/lessons/12945
 * @Desc	: 피보나치 수의 경우 44번째에서 Int자료형 보다 커진다.
 *            문제의 제한사항 중 최대 피보나치 수는 100000번째 피보나치 수를 구해야 함으로 Int 자료형을 사용할 수 없다.
 *            자료형을 변경하여 문제를 해결하려 하는 것 보다, 모듈러 연산의 특징을 활용하여야 한다.
 *
 */
public class Fibonacci {
  public int solution(int n) {
    final int DIVIDER = 1234567;
    int answer = 0;
    int[] f = new int[n + 1];

    IntStream.rangeClosed(0, n).forEach(i -> {
      if (i == 0) {
        f[i] = 0;
      } else if (i == 1) {
        f[i] = 1;
      } else {
        f[i] = (f[i - 1] % DIVIDER) + (f[i - 2] % DIVIDER);
      }
    });

    answer = f[n];

    return answer;
  }

}
