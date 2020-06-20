package com.choong.problem.knowledge.algorithm.dynamic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @title	: Ugly Number
 * @author	: CHOONG
 * @Desc	: https://practice.geeksforgeeks.org/problems/ugly-numbers/0
 *
 */

public class UglyNumber {

  public int getUglyNumber(int n) {

    int num = 1;
    for (int i = 0; i < n;) {
      if (isUglyNum(num)) {
        i++;
//        System.out.println(num);
      }
      num++;
    }
    return num - 1;

  }

  public boolean isUglyNum(int n) {

    while (n % 2 == 0) {
      n = n / 2;
    }

    while (n % 3 == 0) {
      n = n / 3;
    }

    while (n % 5 == 0) {
      n = n / 5;
    }

    if (n == 1) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    UglyNumber uglyNumber = new UglyNumber();
    Scanner scanner = new Scanner(System.in);
    List<Integer> nthList = new ArrayList<Integer>();

    int num = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < num; i++) {
      int nth = Integer.parseInt(scanner.nextLine().trim());
      nthList.add(nth);
    }
    
    for (Integer nth : nthList) {
      System.out.println(uglyNumber.getUglyNumber(nth));
    }

    scanner.close();

  }

}
