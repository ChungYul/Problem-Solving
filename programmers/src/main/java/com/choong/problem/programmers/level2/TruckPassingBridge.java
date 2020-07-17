package com.choong.problem.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @title	: 다리를 지나는 트럭
 * @author	: CHOONG
 * @Desc	: 프로그래머스, 다리를 지나는 트럭
 * @Url     : https://programmers.co.kr/learn/courses/30/lessons/42583
 *
 */
public class TruckPassingBridge {

  public int solution(int bridge_length, int weight, int[] truck_weights) {
    // Truck 정보 구조체
    class Truck {
      Integer weight;
      Integer startTime;

      Truck(Integer weigth, Integer startTime) {
        this.weight = weigth;
        this.startTime = startTime;
      }

      Integer getWeigth() {
        return this.weight;
      }

      Integer getStartTime() {
        return this.startTime;
      }

      void setStartTime(Integer startTime) {
        this.startTime = startTime;
      }
    }

    int answer = 0;
    int length = truck_weights.length;
    int passingWeight = 0;
    Queue<Truck> waitingTruck = new LinkedList<Truck>();
    Queue<Truck> passingTruck = new LinkedList<Truck>();
    Queue<Truck> doneTruck = new LinkedList<Truck>();

    // Truck을 WaitingQueue에 넣는다.
    for (int i = 0; i < truck_weights.length; i++) {
      Truck t = new Truck(truck_weights[i], 0);
      waitingTruck.add(t);
    }

    while (doneTruck.size() != length) {
      Truck t = null;
      answer++;

      // 다리를 지나고 있는 트럭이 다리를 다 건넜는지 확인한다.
      if (!passingTruck.isEmpty()) {
        t = passingTruck.peek();
        if ((answer - t.getStartTime()) == bridge_length) {
          passingWeight = passingWeight - t.getWeigth();
          doneTruck.add(passingTruck.poll());
        }
      }

      // 대기 큐에 있는 트럭을 확인하여 다리로 진입시킨다.
      if (!waitingTruck.isEmpty()) {
        t = waitingTruck.peek();
        passingWeight = passingWeight + t.getWeigth();
        if (passingWeight <= weight) {
          t.setStartTime(answer);
          passingTruck.add(t);
          waitingTruck.poll();
        } else {
          passingWeight = passingWeight - t.getWeigth();
        }
      }
    }
    // System.out.println(answer);
    return answer;
  }

}
