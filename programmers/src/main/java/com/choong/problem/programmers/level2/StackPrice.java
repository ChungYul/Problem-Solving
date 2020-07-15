package com.choong.problem.programmers.level2;
/**
 * 
 * @title	: 주식가격
 * @author	: CHOONG
 * @Desc	: 프로그래머스 주식가격
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/42584#qna
 *
 */
public class StackPrice {

  public int[] solution(int[] prices) {
    int n = prices.length;
    int[] answer = new int[n];
    int time = 0;

    for (int i = 0; i < n; i++) {
      time = 0;
      for (int j = i + 1; j < n; j++) {
        time++;
        if (prices[j] < prices[i]) {
          break;
        }
      }
      answer[i] = time;
    }

    // System.out.println(Arrays.toString(answer));

    return answer;
  }

}
