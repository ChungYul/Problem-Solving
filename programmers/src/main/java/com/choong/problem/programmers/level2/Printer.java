package com.choong.problem.programmers.level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @title	: 프린터
 * @author	: CHOONG
 * @Desc	: 프로그래머스, 프린터 문제
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/42587
 *
 */
public class Printer {

  class Document {
    Integer key;
    Integer priorities;

    public Document(Integer key, Integer priorities) {
      // TODO Auto-generated constructor stub
      this.key = key;
      this.priorities = priorities;
    }

    Integer getKey() {
      return key;
    }

    Integer getPriorities() {
      return priorities;
    }

  }

  public int solution(int[] priorities, int location) {

    int answer = 1;
    int index = priorities.length - 1;
    int value = priorities[location];
    Document document = null;
    Queue<Document> printQueue = new LinkedList<Document>();

    for (int i = 0; i < priorities.length; i++) {
      printQueue.offer(new Document(i, priorities[i]));
    }

    Arrays.sort(priorities);
    
    while (index>-1) {
      
      document = print(printQueue, priorities[index]);
      if (document.getPriorities() == value && document.getKey() == location)
        break;
      
      answer++;
      index--;
    }

//    System.out.println(answer);

    return answer;
  }

  private Document print(Queue<Document> printQueue, int priority) {
    Queue<Document> tempQueue = new LinkedList<Document>();

    Document doc = null;
    while (true) {
      doc = printQueue.peek();
      if (doc.getPriorities() == priority) {
//        System.out.println("Document : " + doc.priorities + " priorities : " + priority);
        printQueue.poll();

        for (Document document : tempQueue) {
          printQueue.add(document);
        }

        break;
      } else {
        tempQueue.add(printQueue.poll());
      }
    }
    
    return doc;
  }
  
}
