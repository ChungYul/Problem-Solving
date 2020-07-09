package com.choong.problem.programmers.level2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
/**
 * 
 * @title	: 가장 큰 수
 * @author	: CHOONG
 * @Desc	: 프로그래머스 가장 큰 수
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/42746
 *
 */
public class LargestNumber {
  public String solution(int[] numbers) {
    String answer = "";

    answer = IntStream.of(numbers).mapToObj(i -> String.valueOf(i))
        .sorted((s1, s2) -> (s2 + s1).compareTo(s1 + s2)).collect(Collectors.joining());
    
    if(answer.startsWith("0"))
      answer = "0";
    
//    System.out.println(answer);
    return answer;
  }

}
