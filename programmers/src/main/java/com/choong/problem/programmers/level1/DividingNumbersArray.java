package com.choong.problem.programmers.level1;

import java.util.stream.IntStream;

/**
 * 
 * @title	: 나누어 떨어지는 숫자 배열
 * @author	: CHOONG
 * @Desc	: 프로그래머스, 나누어 떨어지는 숫자 배열 문제
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/12910
 *
 */

public class DividingNumbersArray {

  public int[] solution(int[] arr, int divisor) {
    int[] answer = {};

    answer = IntStream.of(arr).filter(i -> (i % divisor) == 0).sorted().toArray();

    if (answer.length == 0) {
      answer = new int[1];
      answer[0] = -1;
    }

//    System.out.println(Arrays.toString(answer));
    return answer;
  }

}
