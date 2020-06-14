package com.choong.problem.programmers.other;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * @title   : 나머지 한 점
 * @author  : CHOONG
 * @Desc    : 프로그머스 프로그래밍 강의, 알고리즘 문제 해설, 나머지 한
 *
 */
public class RectanglePoint {

  public int[] solution(int[][] v) {
    int[] answer = new int[2];
    Map<Integer, Integer> x_axis = new HashMap<Integer, Integer>();
    Map<Integer, Integer> y_axis = new HashMap<Integer, Integer>();

    for (int y = 0; y < v.length; y++) {
      int[] point = v[y];
      x_axis.put(point[0], x_axis.getOrDefault(point[0], 0) + 1);
      y_axis.put(point[1], y_axis.getOrDefault(point[1], 0) + 1);
      // System.out.println("x-Key: " + point[0] + " valeu: " + x_axis.get(point[0]));
    }

    Set<Entry<Integer, Integer>> xEntrySet = x_axis.entrySet();
    Set<Entry<Integer, Integer>> yEntrySet = y_axis.entrySet();

    for (Entry<Integer, Integer> entry : xEntrySet) {
      if (entry.getValue() == 1) {
        answer[0] = entry.getKey();
      }
    }

    for (Entry<Integer, Integer> entry : yEntrySet) {
      if (entry.getValue() == 1) {
        answer[1] = entry.getKey();
      }
    }

    return answer;
  }

}
