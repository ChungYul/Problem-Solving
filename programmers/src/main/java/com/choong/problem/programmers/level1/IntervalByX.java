package com.choong.problem.programmers.level1;

import java.util.stream.LongStream;

/**
 * 
 * @title   : x만큼 간격이 있는 n개의 숫자
 * @author  : CHOONG
 * @Desc    : 프로그래머스 x만큼 간격이 있는 n개의 숫자 문제
 *
 */

public class IntervalByX {

  public long[] solution(int x, int n) {
    long[] answer = {};
    answer = LongStream.iterate(x, i -> i + x).limit(n).toArray();

    return answer;
  }

}
