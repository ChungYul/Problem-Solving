package com.choong.problem.programmers.level2;

import java.util.Stack;
/**
 * 
 * @title	: 쇠막대기
 * @author	: CHOONG
 * @Desc	: 프로그래머스, 쇠막대기 문제
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/42585
 *
 */
public class IronBar {

  public int solution(String arrangement) {
    final String OPEN = "(";
    final String CLOSE = ")";
    String previous = null;
    int answer = 0;

    Stack<String> ironCount = new Stack<String>();
    String[] arrangementArr = arrangement.split("");

    for (String iron : arrangementArr) {
      // System.out.println(iron);
      if (iron.equals(OPEN)) {
        // OPEN 이면 쇠막대라고 간주하고 Stack에 넣는다.
        ironCount.add(iron);
      } else if (previous.equals(OPEN) && iron.equals(CLOSE)) {
        // 바로 전이 OPEN 이고, 현재 CLOSE 이면 레이저로 처리하다.
        // 레이저이면 Iron 이 잘라지므로, Iron 개수만큼 더 한다.
        ironCount.pop();
        answer = answer + (ironCount.size());
      } else if (iron.equals(CLOSE)) {
        ironCount.pop();
        answer++;
      }
      // System.out.println("answer = " + answer);
      previous = iron;
    }
    return answer;
  }

}
