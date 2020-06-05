package com.choong.problem.programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

// https://www.geeksforgeeks.org/lzw-lempel-ziv-welch-compression-technique/
// https://rosettacode.org/wiki/LZW_compression#Java
/**
 * 
 * @title	: 압축
 * @author	: CHOONG
 * @Desc	: 2018 카카오 블라인드 리쿠르트, [3차] 압
 *
 */
public class Compression {

  public int[] solution(String msg) {
    int[] answer = {};
    String[] alphabet = Stream.iterate('A', c -> (char) (c + 1)).limit(26).map(x -> x.toString())
        .toArray(String[]::new);
    Map<String, Integer> dictionary = new HashMap<String, Integer>();
    List<Integer> answerList = new ArrayList<Integer>();
    String word = null, newWord = null;
    int beginIndex = 0, endIndex = 1, value = 27;
    
    for (int i = 0; i < 26; i++) {
      dictionary.put(alphabet[i], i + 1);
    }

    while (true) {
      newWord = msg.substring(beginIndex, endIndex);
      if (dictionary.containsKey(newWord)) {
        word = newWord;
        endIndex++;
      } else {
        beginIndex = endIndex - 1;
        endIndex = beginIndex + 1;
        answerList.add(dictionary.get(word));
        dictionary.put(newWord, value);
        value++;
      }

      if (endIndex > msg.length() && dictionary.containsKey(word)) {
        answerList.add(dictionary.get(word));
        break;
      }
    }
    
    answer = answerList.stream().mapToInt(i -> i.intValue()).toArray();
    return answer;
  }

}
