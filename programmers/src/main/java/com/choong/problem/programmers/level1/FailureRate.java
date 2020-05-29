package com.choong.problem.programmers.level1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 
 * @title   : 실패율
 * @author  : CHOONG
 * @Desc    : 2019년 KAKAO BLIND RECRUITMENT, 프로그래머스 실패율 문제
 *
 */
public class FailureRate {

  public int[] solution(int N, int[] stages) {

    class Stage {
      Integer id; // 게임 스테이지
      Integer userCount; // 현재 스테이지를 클리어하지 못한 사용자
      Integer totalCandidate; // 현재 스테이지를 도전한 도전
      Double failureRate; // 실패율

      Stage(Integer id) {
        this.id = id;
        this.userCount = 0;
        this.totalCandidate = 0;
        this.failureRate = 0.0;
      }

      Integer getId() {
        return this.id;
      }

      Integer getUserCount() {
        return this.userCount;
      }

      Integer getTotalCondidate() {
        return this.totalCandidate;
      }

      void setTotalCandidate(Integer totalCandidate) {
        this.totalCandidate = totalCandidate;
      }

      void increaseUserCount() {
        this.userCount++;
      }

      void calculateFailureRate() {
        if (totalCandidate != 0) // 분자가 0일 경우 Error Check
          this.failureRate = (double) userCount / totalCandidate;
      }

      Double getFailureRate() {
        return this.failureRate;
      }

      public String toString() {
        return new String("id : " + id + " userCount : " + userCount + " totalCandidate : "
            + totalCandidate + " failureRate : " + failureRate);
      }

    }

    int[] answer = {};
    List<Stage> stageList = new ArrayList<Stage>();

    // 데이터 초기화
    for (int i = 0; i < N; i++) {
      stageList.add(i, new Stage(i + 1));
    }
    IntStream.of(stages).filter(i -> i <= N).forEach(i -> stageList.get(i - 1).increaseUserCount());

    // 실패율 계산
    stageList.get(0).setTotalCandidate(stages.length);
    stageList.get(0).calculateFailureRate();
    IntStream.range(1, N).forEach(i -> {
      stageList.get(i).setTotalCandidate(
          stageList.get(i - 1).getTotalCondidate() - stageList.get(i - 1).getUserCount());
      stageList.get(i).calculateFailureRate();
    });
    
    // 정렬
    Comparator<Stage> firstSort =
        (stage1, stage2) -> Double.compare(stage2.getFailureRate(), stage1.getFailureRate());
    Comparator<Stage> secondSort = (stage1, stage2) -> stage1.getId().compareTo(stage2.getId());

    answer = stageList.stream().sorted(firstSort.thenComparing(secondSort))
        .mapToInt(s -> s.getId().intValue()).toArray();

    return answer;

  }

}
