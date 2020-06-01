package com.choong.problem.programmers.level1;

/**
 * 
 * @title	: 핸드폰 번호 가리기 문제
 * @author	: CHOONG
 * @Desc	: 프로그래머스 핸드폰 가리기 문제 풀이
 *
 */
public class CellPhoneNumberMasking {

  public String solution(String phone_number) {
    final String REGEX = "\\d";
    int unmaskingIndex = phone_number.length() - 4;
    String answer = phone_number.substring(0, unmaskingIndex).replaceAll(REGEX, "*")
        + phone_number.substring(unmaskingIndex);
    // phone_number.replaceAll(".(?=.{4})", "*");
    return answer;
  }

}
