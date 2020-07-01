package com.choong.problem.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @title	: 문자열 내 맘대로 정렬하기
 * @author	: CHOONG
 * @desc	: 프로그래머스 문자열 내 맘대로 정렬 문
 * @url     : https://programmers.co.kr/learn/courses/30/lessons/12915
 *
 */
public class SortStringMyWay {

  public String[] solution(String[] strings, int n) {
    String[] answer = {};
    Comparator<String> firstSort = (s1, s2) -> {
      return s1.charAt(n) - s2.charAt(n);
    };

    Comparator<String> secondSort = (s1, s2) -> s1.compareTo(s2);

    List<String> stringList = Arrays.asList(strings);
    Collections.sort(stringList, firstSort.thenComparing(secondSort));
    answer = stringList.toArray(new String[0]);

//    System.out.println(Arrays.toString(answer));

    return answer;
  }

}
