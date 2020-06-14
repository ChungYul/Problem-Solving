package com.choong.problem.programmers.other;

/**
 * 
 * @title   : 자릿수 더하기 
 * @author  : CHOONG
 * @Desc    : 프로그머스 프로그래밍 강의, 알고리즘 문제 해설, 자릿수 더하기
 *
 */
public class AddingDigits {

  public int solution(int n) {
    int answer = 0;

    answer = String.valueOf(n).chars().map(c -> (c-48)).sum();

    return answer;
  }

}
