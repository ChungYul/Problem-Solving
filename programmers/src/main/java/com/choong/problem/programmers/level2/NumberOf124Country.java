package com.choong.problem.programmers.level2;

/**
 * 
 * @title	: 124 나라의 숫자
 * @author	: CHOONG
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/12899
 * @Desc	: 프로그래머스 124 나라의 숫자
 *            1. 3진수와 동일한 개념으로 풀면 됨
 *            2. 하지만 1, 2, 4를 사용함으로 4를 3진수의 0으로 가정, 4는 10진수로는 3
 *            3. 만약, 3으로 나눈 나머지가 0인 경우, 4로 표시되는 경우는 자릿수 증가를 막기위해 몫에서 -1해야 함
 */
public class NumberOf124Country {

  public String betterSolution(int n) {
    String answer = "";
    final String[] num = {"4", "1", "2"};

    while (n > 0) {
      answer = num[n % 3] + answer;
      n = (n - 1) / 3;
    }
    return answer;
  }

  public String solution(int n) {
    String answer = "";
    int remain = -1;

    while (n > 0) {
      remain = n % 3;
      n = n / 3;
      if (remain == 0) {
        answer = "4" + answer;
        n = n - 1;
      } else {
        answer = String.valueOf(remain) + answer;
      }
    }

//    System.out.println(answer);
    return answer;
  }

}
