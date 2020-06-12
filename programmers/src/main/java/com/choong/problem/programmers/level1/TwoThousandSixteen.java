package com.choong.problem.programmers.level1;
/**
 * 
 * @title	: 2016년 
 * @author	: CHOONG
 * @Desc	: 프로그래머스 2016년 문제 풀이
 *
 */
public class TwoThousandSixteen {

  public String solution(int a, int b) {
    String[] dayOfWeek = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
    int[] monthOfday = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String answer = "";
    int day = 0;

    for (int i = 1; i < a; i++) {
      day = day + monthOfday[i];
    }

    day = day + b;
    answer = dayOfWeek[day % 7];

    return answer;
  }

}
