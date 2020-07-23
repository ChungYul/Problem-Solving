package com.choong.problem.programmers.level1;

/**
 * 
 * @title	: 문자열 내 p와 y의 개수
 * @author	: CHOONG
 * @url		: https://programmers.co.kr/learn/courses/30/lessons/12916
 * @Desc	: 프로그래머스, 문자열 내 p와 y의 개수
 *
 */
public class CountPandY {

  boolean solution(String s) {
    boolean answer = true;
    char low_p = 'p', capital_p = 'P';
    char low_y = 'y', capital_y = 'Y';

    long count_p = s.chars().filter(c -> (c == low_p || c == capital_p)).count();
    long count_y = s.chars().filter(c -> (c == low_y || c == capital_y)).count();

    if (count_p == count_y) {

    } else {
      answer = false;
    }

    System.out.println(answer);

    return answer;
  }

}
