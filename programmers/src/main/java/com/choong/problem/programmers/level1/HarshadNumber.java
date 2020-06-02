package com.choong.problem.programmers.level1;

/**
 * 
 * @title	: 하샤드 수 문제
 * @author	: CHOONG
 * @Desc	: 프로그래머스 하샤드 수 문제 풀이
 *
 */
public class HarshadNumber {

  public boolean solution(int x) {
    boolean answer = false;
    int divisor = 0;
    divisor = String.valueOf(x).chars().map(c -> (c - 48)).sum();
    if ((x % divisor) == 0) {
      answer = true;
    }
    return answer;
  }

}
