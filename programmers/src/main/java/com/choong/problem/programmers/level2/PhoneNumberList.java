package com.choong.problem.programmers.level2;

/**
 * 
 * @title   : 전화번호 목록 
 * @author  : CHOONG
 * @Desc    : 프로그래머스 전화번호 목록 문제 
 *
 */
// https://www.baeldung.com/trie-java
public class PhoneNumberList {

  public boolean solution(String[] phone_book) {
    boolean answer = true;
    // Map<String, V>

    for (int i = 0; i < phone_book.length; i++) {
      if (answer)
        for (int j = (i+1); j < phone_book.length; j++) {
          if (isContain(phone_book[i], phone_book[j])) {
            answer = false;
            return answer;
          }
        }
    }

    return answer;
  }

  private boolean isContain(String s1, String s2) {
    if (s1.length() >= s2.length()) {
      return s1.startsWith(s2);
    } else {
      return s2.startsWith(s1);
    }
  }

}
