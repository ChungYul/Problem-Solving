package com.choong.problem.programmers.level1;

import java.util.Arrays;

/**
 * 
 * @title	: K번째 수
 * @author	: CHOONG
 * @Desc	: 프로그래머스 K번째 수
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/42748
 *
 */

public class KthNumber {

  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];
    for (int i = 0; i < commands.length; i++) {
      int start = commands[i][0];
      int end = commands[i][1];
      int kth = commands[i][2];
      int j = 0;
      int[] subArray = new int[end - start + 1];

      for (int index = start - 1; index < end; index++) {
        subArray[j] = array[index];
        j++;
      }

      Arrays.sort(subArray);

      answer[i] = subArray[kth - 1];

    }

    // System.out.println(Arrays.toString(answer));
    return answer;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    KthNumber kthNumber = new KthNumber();
    kthNumber.solution(new int[] {1, 5, 2, 6, 3, 7, 4},
        new int[][] {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

  }

}
