package com.choong.problem.programmers.level1;

import java.util.Scanner;

/**
 * 
 * @title	: 직사각형 별찍기 문제
 * @author	: CHOONG
 * @Desc	: 프로그래머스 직사각형 별찍기 문기
 *
 */

public class RectangularStars {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    for(int y=0; y<b; y++) {
      for (int x = 0; x < a; x++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }

}
