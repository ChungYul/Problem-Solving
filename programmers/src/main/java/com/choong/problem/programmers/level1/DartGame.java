package com.choong.problem.programmers.level1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class DartGame {
  // https://unlimitedpower.tistory.com/entry/%EC%A0%95%EA%B7%9C%ED%91%9C%ED%98%84%EC%8B%9D-%EC%9D%B4%EA%B2%83%EC%9D%B4-%EA%B3%A0%EA%B8%89%EC%9D%B4%EB%8B%A4-Positive-Negative-Lookahead-Lookbehind
  // https://stackoverflow.com/questions/16787099/how-to-split-the-string-into-string-and-integer-in-java
  // https://soooprmx.com/archives/7718
  // https://m.blog.naver.com/bb_/220863282423

  public int solution(String dartResult) {
    final String resultRegex = "\\d+[SDTsdt]\\#*\\**";
    final String scoreRegx = "(?<=\\d)(?=\\D)";
    int answer = 0;
    String[] eachBonus = new String[3];
    int[] eachScore = new int[3];
    int idx = 0;

    Pattern pattern = Pattern.compile(resultRegex);
    Matcher matcher = pattern.matcher(dartResult);

    while (matcher.find()) {
      String result = matcher.group();
      String[] s = result.split(scoreRegx);
      eachScore[idx] = Integer.valueOf(s[0]);
      eachBonus[idx] = s[1];
      idx++;
    }

    for (idx = 0; idx < 3; idx++) {
      // eachBonus[idx].chars().mapToObj(item -> (char) item).forEach(calculateBonus);
      char[] c = eachBonus[idx].toCharArray();
      for (int i = 0; i < c.length; i++) {
        if (c[i] == 'S') {

        } else if (c[i] == 'D') {
          eachScore[idx] = eachScore[idx]*eachScore[idx];
        } else if (c[i] == 'T') {
          eachScore[idx] = eachScore[idx]*eachScore[idx]*eachScore[idx];
        } else if (c[i] == '*') {
          eachScore[idx] = eachScore[idx] * 2;
          if (idx != 0) {
            eachScore[idx - 1] = eachScore[idx - 1] * 2;
          }
        } else if (c[i] == '#') {
          eachScore[idx] = eachScore[idx] * -1;
        }
      }
    }

    answer = IntStream.of(eachScore).sum();

    return answer;
  }
 
}
