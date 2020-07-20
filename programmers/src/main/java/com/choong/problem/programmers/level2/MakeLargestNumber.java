package com.choong.problem.programmers.level2;

/**
 * 
 * @title	: 큰 수 만들기
 * @author	: CHOONG
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/42883
 * @Desc	: 프로그래머스 큰 수 만들기
 *            1. 앞의 원소보다 뒤의 원소가 더 크면, 앞의 원소를 삭제
 *            2. 속도 제한이 있으므로 속도 제한을 신경써야 함.
 *            3. StringBuilder 가 String에 비해 훨씬 속도가 빠름ㄹ / StringBuilder에 대한 학습 필요
 *
 */
public class MakeLargestNumber {

  public String solution(String number, int k) {
    StringBuilder answer = new StringBuilder(number);
    int delCount = 0, length = 0, index = 0;

    while (delCount < k) {
      length = answer.length();
      index = length - 1;
      for (int i = 0; i < length - 1; i++) {
        // 앞의 원소보다 뒤의 원소가 더 크면 앞의 원소를 삭제한다.
        if (answer.charAt(i) < answer.charAt(i + 1)) {
          index = i;
          break;
        }
      }
      answer.deleteCharAt(index);
      delCount++;
    }
//     System.out.println(answer);
    return answer.toString();
  }

}
