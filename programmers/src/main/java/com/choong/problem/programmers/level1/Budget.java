package com.choong.problem.programmers.level1;

import java.util.Arrays;

public class Budget {

  public static int solution(int[] d, int budget) {
    int answer = 0;
    Arrays.sort(d);
    for(int val : d) {
      budget = budget - val;
      if(budget >= 0) {
        answer++;
      } else {
        break;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    int answer = Budget.solution(new int[] {1,3,2,5,4}, 9);
    System.out.println("exam1 : " + answer);
    answer = Budget.solution(new int[] {2,2,3,3}, 10);
    System.out.println("exam2 : " + answer);
  }

}
