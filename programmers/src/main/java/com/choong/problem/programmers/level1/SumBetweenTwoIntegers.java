package com.choong.problem.programmers.level1;

import java.util.stream.LongStream;
/**
 * 
 * @title	: 두 정수 사이의 합
 * @author	: CHOONG
 * @Desc	: 프로그래머스, 두 정수 사이의 합 테스트
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/12912
 *
 */

public class SumBetweenTwoIntegers {

  public long solution(int a, int b) {
    long answer = 0;
    if(a>=b) {
      answer = LongStream.rangeClosed(b, a).sum();
    } else {
      answer = LongStream.rangeClosed(a, b).sum();
    }
    
//    System.out.println(answer);
    return answer;
  }

}
