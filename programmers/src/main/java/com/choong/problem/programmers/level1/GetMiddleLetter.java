package com.choong.problem.programmers.level1;

/**
 * 
 * @title	: 가운데 글자 가져오기
 * @author	: CHOONG
 * @Desc	: 프로그래머스, 가운데 글자 가져오기 문제
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/12903
 *
 */

public class GetMiddleLetter {

  public String solution(String s) {
    String answer = "";
    int d = s.length() / 2;
    if (s.length() % 2 == 0) {
      answer = s.substring(d - 1, d + 1);
    } else {
      answer = s.substring(d, d + 1);
    }
    return answer;
  }

}
