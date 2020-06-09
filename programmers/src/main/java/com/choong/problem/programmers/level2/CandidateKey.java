package com.choong.problem.programmers.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @title   : 후보키
 * @author  : CHOONG
 * @Desc    : 2019 카카오 블라인드 리쿠르트, 후보키
 *
 */
public class CandidateKey {

  int colLength = 0;
  int rowLength = 0;
  int[] colIndex;
  boolean[] visited;
  List<String> keyCombinationList;

  public CandidateKey() {
    keyCombinationList = new ArrayList<String>();
  }

  private void addKeyCombination(int[] arr, boolean[] visited) {
    String keyIndex = "";
    for (int i = 0; i < arr.length; i++) {
      if (visited[i] == true) {
        keyIndex = keyIndex + String.valueOf(i);
      }
    }
    keyCombinationList.add(keyIndex);
  }

  private void combination(int[] arr, boolean[] visited, int start, int n, int r) {
    if (r == 0) {
      addKeyCombination(arr, visited);
      return;
    }

    for (int i = start; i < n; i++) {
      visited[i] = true;
      combination(arr, visited, i + 1, n, r - 1);
      visited[i] = false;
    }
  }

  private boolean isUnique(String[] candidateKeySet) {
    if (candidateKeySet.length == Stream.of(candidateKeySet).distinct().count())
      return true;

    return false;
  }

  private boolean isMinimal(String keyIndex, List<String> answerList) {
    // System.out.println("keyIndex : " + keyIndex);
    String[] keyIndexElements = keyIndex.split("");
    int count = 0;
    for (String val : answerList) {
      count = 0;
      for (String element : keyIndexElements) {
        if (val.contains(element)) {
          count++;
        }
        if (val.length() == count) {
          return false;
        }
      }
    }
    answerList.add(keyIndex);
    return true;
  }

  private String[] makeKeySet(String keyIndex, String[][] relation) {
    String[] keyIndexElements = keyIndex.split("");
    String[] keySet = new String[rowLength];
    for (int y = 0; y < rowLength; y++) {
      String key = "";
      for (String val : keyIndexElements) {
        int x = Integer.valueOf(val);
        key = key + relation[y][x];
      }
      keySet[y] = key;
    }
    return keySet;
  }

  public int solution(String[][] relation) {
    int answer = 0;
    List<String> answerList = new ArrayList<String>();
    colLength = relation[0].length;
    rowLength = relation.length;
    colIndex = IntStream.range(0, colLength).toArray();
    visited = new boolean[colLength];

    // Key 조합의 경우의 수 생성
    for (int i = 1; i <= colLength; i++) {
      combination(colIndex, visited, 0, colLength, i);
    }

    // 실제 주어진 데이터 Set 생성
    for (String val : keyCombinationList) {
      String[] candidateKeySet = makeKeySet(val, relation);
      if (isUnique(candidateKeySet) && isMinimal(val, answerList)) {
        answer++;
      }
    }

    return answer;
  }

}
