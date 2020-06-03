package com.choong.problem.programmers.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 
 * @title	: n진수 게임 
 * @author	: CHOONG
 * @Desc	: 2018 카카오 블라인드 리쿠르트, [3차] n진수 게임 
 *
 */
// https://www.geeksforgeeks.org/find-the-nth-digit-from-right-in-base-b-of-the-given-number-in-decimal-base/
public class Base_N_NumberGame {

  // 진법 n, 미리구할 숫자 개수 t, 게임에 참가하는 인원 m, 튜브의 순서 p
  public String solution(int n, int t, int m, int p) {
    String answer = "";
    int[] nthArray = IntStream.rangeClosed(1, t).map(i -> (i - 1) * m + p).toArray();
    int maxDigit = Integer.toString(nthArray[t - 1], n).length();
    int[] powerN = IntStream.range(1, maxDigit + 1).map(i -> (int) Math.pow(n, i)).toArray();
    List<Integer> list = new ArrayList<Integer>();
    list.add(0, n - 1);
    if (maxDigit > 1) {
      for (int i = 1; i < maxDigit; i++)
        list.add((powerN[i] - powerN[i - 1]) * (i + 1) + list.get(i - 1));
    }
    int digitIdx = 0;

    for (int nth : nthArray) {
      nth--; // 0부터 시작함으로 -1
      while (nth > list.get(digitIdx)) {
        digitIdx++;
      }
      if (digitIdx != 0) {
        nth = nth - list.get(digitIdx - 1);
      }

      int div = nth / (digitIdx + 1);
      int remainder = nth % (digitIdx + 1);
      int est = div;

      if (digitIdx != 0) {
        est = est + powerN[digitIdx - 1] - 1;
      }
      if (remainder == 0) {
        answer = answer + Integer.toString(est, n).substring(digitIdx).toUpperCase();
      } else {
        est = est + 1;
        answer =
            answer + Integer.toString(est, n).substring(remainder - 1, remainder).toUpperCase();
      }
      digitIdx = 0;

      // System.out.println("nth : " + nth);
      // System.out.println("est : " + est);
    }

    return answer;
  }

}
