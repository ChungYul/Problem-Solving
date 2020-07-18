package com.choong.problem.programmers.level2;

import java.util.Collections;
import java.util.stream.IntStream;

/**
 * 
 * @title	: H-Index
 * @author	: CHOONG
 * @Desc	: 프로그래머스 H-Index 문제
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/42747#qna
 *
 */
public class H_Index {

  public int solution(int[] citations) {
//    https://en.wikipedia.org/wiki/H-index
//    Formally, if f is the function that corresponds to the number of citation for each publication
//    First we order the values of f from the largest to the lowest Value.
//    then, we look for the last position in which f is greater than or equal to the position( we call h this position).
    int answer = 0, length = citations.length;
    Integer[] boxedCitations =
        IntStream.of(citations).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);

    answer = IntStream.rangeClosed(1, length)
        .map(i -> (Math.min(i, boxedCitations[i - 1].intValue()))).max().getAsInt();

//    System.out.println(answer);
    return answer;
  }

}
