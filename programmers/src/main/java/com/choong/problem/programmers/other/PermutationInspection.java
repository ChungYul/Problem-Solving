package com.choong.problem.programmers.other;

/**
 * 
 * @title   : 순열 검사
 * @author  : CHOONG
 * @Desc    : 프로그머스 프로그래밍 강의, 알고리즘 문제 해설, 순열 검사 문
 *
 */
public class PermutationInspection {

  public boolean solution(int[] arr) {
    boolean answer = true;
    boolean[] check = new boolean[arr.length];

    for (int i : arr) {
      if (i > (arr.length) || i <= 0)
        return false;
      else {
        check[i - 1] = true;
      }
    }

    for (boolean b : check) {
      if (b) {

      } else {
        return false;
      }
    }

    return answer;
  }

}
