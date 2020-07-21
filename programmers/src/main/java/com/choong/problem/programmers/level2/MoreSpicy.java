package com.choong.problem.programmers.level2;

import java.util.PriorityQueue;

/**
 * 
 * @title	: 더 맵게
 * @author	: CHOONG
 * @url		: https://programmers.co.kr/learn/courses/30/lessons/42626
 * @Desc	: 프로그래머스, 더 맵게
 *
 */
public class MoreSpicy {

  public int solution(int[] scoville, int K) {
    int answer = 0;
    PriorityQueue<Integer> q = new PriorityQueue<Integer>();

    for (int i = 0; i < scoville.length; i++) {
      q.add(scoville[i]);
    }


    while (q.peek() < K) {
      if (q.size() >= 2) {
        Integer i1 = q.poll();
        Integer i2 = q.poll();
        Integer i3 = i1 + (i2 * 2);
        q.add(i3);
        answer++;
      } else {
        answer = -1;
        break;
      }

    }

    return answer;
  }

}
