package com.choong.problem.programmers.level1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @title	: 크레인 인형뽑기 게임
 * @author	: CHOONG
 * @Desc	: 2019 카카오 개발자 겨울 인턴십,프로그레머스 크레인 인형뽑기 게임
 *
 */

public class CraneGame {

  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    int length = board[0].length;
    List<Integer> remainList = new ArrayList<Integer>();
    int idx = 0;

    for (int y : moves) {
      for (int x = 0; x < length; x++) {
        if (board[x][y - 1] != 0) {
          if (remainList.size() == 0) {
            remainList.add(idx, board[x][y - 1]);
            board[x][y - 1] = 0;
            idx++;
            break;
          } else if (remainList.get(idx - 1) == board[x][y - 1]) {
            remainList.remove(idx - 1);
            board[x][y - 1] = 0;
            idx--;
            answer = answer + 2;
            break;
          } else if (remainList.get(idx - 1) != board[x][y - 1]) {
            remainList.add(idx, board[x][y - 1]);
            board[x][y - 1] = 0;
            idx++;
            break;
          }
        }
      }
    }

    return answer;
  }

}
