package com.choong.problem.programmers.level1;

import java.util.function.Function;
import java.util.stream.IntStream;

/**
 * 
 * @title : 비밀지도
 * @author : CHOONG
 * @Desc :  2018년 KAKAO BLIND RECRUITMENT, 프로그래머스 [1차] 비밀지도 문제
 *
 */

public class SecretMap {

  public String[] solution(int n, int[] arr1, int[] arr2) {
    String[] answer = {};
    
    Function<Integer, String> changeToBase2 = i -> {
      return Integer.toString(i, 2).replaceAll("1", "#");
    };
    
    Function<String, String> padLeft = s -> {
      return String.format("%" + n + "s", s).replaceAll("0", " ");
    };

    answer = IntStream
              .range(0, arr1.length)
              .map(i -> (arr1[i] | arr2[i]))
              .boxed()
              .map(changeToBase2)
              .map(padLeft)
              .toArray(String[]::new);

    return answer;
  }

}
