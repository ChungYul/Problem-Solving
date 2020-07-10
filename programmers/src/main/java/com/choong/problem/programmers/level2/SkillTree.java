package com.choong.problem.programmers.level2;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @title  : 스킬트리
 * @author : CHOONG
 * @Desc   : 프로그래머스 스킬트리
 * @Url    : https://programmers.co.kr/learn/courses/30/lessons/49993#qna
 *
 */
public class SkillTree {

  /**
   * @param skill
   * @param skill_trees
   * @return
   */
  public int betterSolution(String skill, String[] skill_trees) {
    int answer = 0;
    List<String> skillTreeList = Arrays.asList(skill_trees);

    for (String node : skillTreeList) {
      // 스킬 트리 Node 중 skill에 포함되지 않은 element는 ""값으로 변환한다.
      // 이 때 정규식을 사용한다. [^문자열]
      if (skill.indexOf(node.replaceAll("[^" + skill + "]", "")) == 0) {
        answer++;
      }
    }

    return answer;
  }

  public int solution(String skill, String[] skill_trees) {
    int answer = 0;
    char[] skillArr = skill.toCharArray();

    for (String node : skill_trees) {
      char[] nodeArr = node.toCharArray();
      int[] indices = getIndices(nodeArr, skillArr);

      answer = answer + isOrder(indices);
    }
    System.out.println(answer);
    return answer;
  }

  /**
   * @param nodeArr  : 스킬트리
   * @param skillArr : 스킬 배
   * @return
   */
  private int[] getIndices(char[] nodeArr, char[] skillArr) {
    // 스킬 트리 중 스킬이 몇 번째 존재하는지, 해당 인덱스를 배열을 리턴한다.
    // 스킬 트리에는 skillArr에 포함된 스킬 전부가 포함되지 않을 수 있다.
    int[] indices = new int[skillArr.length];
    Arrays.fill(indices, 27);

    for (int i = 0; i < skillArr.length; i++) {
      for (int j = 0; j < nodeArr.length; j++) {
        if (skillArr[i] == nodeArr[j]) {
          indices[i] = j;
        }
      }
    }

    return indices;
  }

  /**
   * @param indices : 인텍스 배열
   * @return
   */
  private int isOrder(int[] indices) {
    // 스킬에 대한 인덱스가 오름차순으로 정렬되어 있으면, 1을 리턴하고, 아니면 0을 리턴한다.
    for (int i = 0; i < indices.length; i++) {
      if (i != 0 && indices[i - 1] > indices[i])
        return 0;
    }

    return 1;
  }

}
