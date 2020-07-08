package com.choong.problem.programmers.level2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @title	: 위
 * @author	: CHOONG
 * @Desc	: 프로그래머스 위장
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/42578
 *
 */
public class Disguise {

  public int solution(String[][] clothes) {
    Map<String, Integer> m = new HashMap<String, Integer>();
    int answer = 0;

    for (int i = 0; i < clothes.length; i++) {
      String[] s = clothes[i];

      m.put(s[1], m.getOrDefault(s[1], 0) + 1);
    }

    answer = m.values().stream().reduce(1, (a, b) -> a * (b + 1)) - 1;

    // System.out.println(answer);
    return answer;
  }

  /**
   * 
   * 재귀적으로 조합을 만들어 가능한 위장 개수를 구하는 함수 Map<String, Integer> m 의 1부터 KeySet길이까지 반복하여 수행한다.
   * 
   * @param arr : 조합에서 뽑을 수 있는 전체 n
   * @param sel : 선택한 값을 저장할 수 있는 Array
   * @param n : nCk
   * @param k : nCk
   * @param elements : 조합에 해당하는
   * @param map : 범주와 값을 저장하고 있는 Map
   */
  @SuppressWarnings("unused")
  private void combination(String[] arr, String[] sel, int n, int k, List<Integer> elements,
      Map<String, Integer> map) {
    if (k == sel.length) {
      int element = 1;
      for (String s : sel) {
        element = element * map.get(s);
      }
      elements.add(element);
      return;
    }

    if (n == arr.length) {
      return;
    }
    sel[k] = arr[n];

    combination(arr, sel, n + 1, k + 1, elements, map);
    combination(arr, sel, n + 1, k, elements, map);
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Disguise disguise = new Disguise();
    disguise.solution(new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
        {"green_turban", "headgear"}});


    disguise.solution(new String[][] {{"crow_mask", "face"}, {"blue_sunglasses", "face"},
        {"smoky_makeup", "face"}});

    disguise.solution(new String[][] {{"1", "face"}, {"2", "face"}, {"3", "face"}, {"4", "hair"},
        {"5", "hair"}, {"6", "arm"}, {"7", "arm"}});
  }

}
