package com.choong.problem.programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @title	: 파일명 정렬
 * @author	: CHOONG
 * @Desc	: 2018 카카오 블라인드 리쿠르트, [3차] 파일명 정렬
 *
 */
public class SortFileNames {

  public String[] solution(String[] files) {

    class FileName {
      String m_fullName;
      String m_head;
      Integer m_number;
      String m_tail;

      FileName(String fullName, String head, Integer number, String tail) {
        this.m_fullName = fullName;
        this.m_head = head;
        this.m_number = number;
        this.m_tail = tail;
      }

      String getFullName() {
        return this.m_fullName;
      }
    }

    String[] answer = {};
    List<FileName> fileNameList = new ArrayList<FileName>();
    String regex = "(\\D+)(\\d{1,5})(.*+)";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher;

    for (String val : files) {
      matcher = pattern.matcher(val);
      if (matcher.find()) {
        String fullName = val;
        String head = matcher.group(1);
        Integer number = Integer.parseInt(matcher.group(2));
        String tail = matcher.group(3);
        fileNameList.add(new FileName(fullName, head, number, tail));
      }
    }

    Comparator<FileName> firstSort = (FileName f1, FileName f2) -> f1.m_head.compareToIgnoreCase(f2.m_head);
    Comparator<FileName> secondSort =
        (FileName f1, FileName f2) -> f1.m_number.compareTo(f2.m_number);

    Collections.sort(fileNameList, firstSort.thenComparing(secondSort));
    answer = fileNameList.stream().map(f -> f.getFullName()).toArray(String[]::new);

    return answer;
  }

}
